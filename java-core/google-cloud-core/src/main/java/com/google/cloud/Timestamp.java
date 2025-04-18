/*
 * Copyright 2017 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud;

import static com.google.common.base.Preconditions.checkArgument;

import com.google.api.core.ObsoleteApi;
import com.google.protobuf.util.Timestamps;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Represents a timestamp with nanosecond precision. Timestamps cover the range [0001-01-01,
 * 9999-12-31].
 *
 * <p>{@code Timestamp} instances are immutable.
 */
public final class Timestamp implements Comparable<Timestamp>, Serializable {

  private static final long serialVersionUID = 5152143600571559844L;

  /** The smallest legal timestamp ("0001-01-01T00:00:00Z"). */
  public static final Timestamp MIN_VALUE = new Timestamp(-62135596800L, 0);

  /** The largest legal timestamp ("9999-12-31T23:59:59Z"). */
  public static final Timestamp MAX_VALUE =
      new Timestamp(253402300799L, (int) TimeUnit.SECONDS.toNanos(1) - 1);

  private static final DateTimeFormatter format = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

  private static final DateTimeFormatter timestampParser =
      new DateTimeFormatterBuilder()
          .appendOptional(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
          .optionalStart()
          .appendZoneOrOffsetId()
          .optionalEnd()
          .toFormatter()
          .withZone(ZoneOffset.UTC);

  private final long seconds;
  private final int nanos;

  private Timestamp(long seconds, int nanos) {
    this.seconds = seconds;
    this.nanos = nanos;
  }

  /**
   * Creates an instance representing the value of {@code seconds} and {@code nanos} since January
   * 1, 1970, 00:00:00 UTC.
   *
   * @param seconds seconds since January 1, 1970, 00:00:00 UTC. A negative value is the number of
   *     seconds before January 1, 1970, 00:00:00 UTC.
   * @param nanos the fractional seconds component, in the range 0..999999999.
   * @throws IllegalArgumentException if the timestamp is outside the representable range
   */
  public static Timestamp ofTimeSecondsAndNanos(long seconds, int nanos) {
    checkArgument(
        Timestamps.isValid(seconds, nanos), "timestamp out of range: %s, %s", seconds, nanos);
    return new Timestamp(seconds, nanos);
  }

  /**
   * Creates an instance representing the value of {@code microseconds}.
   *
   * @throws IllegalArgumentException if the timestamp is outside the representable range
   */
  public static Timestamp ofTimeMicroseconds(long microseconds) {
    long seconds = microseconds / 1_000_000;
    int nanos = (int) (microseconds % 1_000_000 * 1000);
    if (nanos < 0) {
      seconds--;
      nanos += 1_000_000_000;
    }
    checkArgument(
        Timestamps.isValid(seconds, nanos), "timestamp out of range: %s, %s", seconds, nanos);
    return new Timestamp(seconds, nanos);
  }

  /**
   * Creates an instance representing the value of {@code Date}.
   *
   * @throws IllegalArgumentException if the timestamp is outside the representable range
   */
  public static Timestamp of(Date date) {
    return ofTimeMicroseconds(TimeUnit.MILLISECONDS.toMicros(date.getTime()));
  }

  /** Creates an instance with current time. */
  public static Timestamp now() {
    java.sql.Timestamp date = new java.sql.Timestamp(System.currentTimeMillis());
    return of(date);
  }

  /**
   * Creates an instance representing the value of {@code timestamp}.
   *
   * @throws IllegalArgumentException if the timestamp is outside the representable range
   */
  public static Timestamp of(java.sql.Timestamp timestamp) {
    int nanos = timestamp.getNanos();

    // A pre-epoch timestamp can be off by one second because of the way that integer division
    // works. For example, -1001 / 1000 == -1. In this case, we want this result to be -2. This
    // causes any pre-epoch timestamp to be off by 1 second - fix this by subtracting 1 from the
    // seconds value if the seconds value is less than zero and is not divisible by 1000.
    // TODO: replace with Math.floorDiv when we drop Java 7 support
    long seconds = timestamp.getTime() / 1000;
    if (seconds < 0 && timestamp.getTime() % 1000 != 0) {
      --seconds;
    }

    return Timestamp.ofTimeSecondsAndNanos(seconds, nanos);
  }

  /**
   * Returns the number of seconds since January 1, 1970, 00:00:00 UTC. A negative value is the
   * number of seconds before January 1, 1970, 00:00:00 UTC.
   */
  public long getSeconds() {
    return seconds;
  }

  /** Returns the fractional seconds component, in nanoseconds. */
  public int getNanos() {
    return nanos;
  }

  /** Returns a JDBC timestamp initialized to the same point in time as {@code this}. */
  public java.sql.Timestamp toSqlTimestamp() {
    java.sql.Timestamp ts = new java.sql.Timestamp(seconds * 1000);
    ts.setNanos(nanos);
    return ts;
  }

  /**
   * Returns a new {@code java.util.Date} corresponding to this {@code timestamp}. Any
   * sub-millisecond precision will be stripped.
   *
   * @return An approximate {@code java.util.Date} representation of this {@code timestamp}.
   */
  public Date toDate() {
    long secondsInMilliseconds = TimeUnit.SECONDS.toMillis(this.seconds);
    long nanosInMilliseconds = TimeUnit.NANOSECONDS.toMillis(this.nanos);
    return new Date(secondsInMilliseconds + nanosInMilliseconds);
  }

  @Override
  public int compareTo(Timestamp other) {
    int r = Long.compare(seconds, other.seconds);
    if (r == 0) {
      r = Integer.compare(nanos, other.nanos);
    }
    return r;
  }

  /** Creates an instance of Timestamp from {@code com.google.protobuf.Timestamp}. */
  public static Timestamp fromProto(com.google.protobuf.Timestamp proto) {
    return new Timestamp(proto.getSeconds(), proto.getNanos());
  }

  /**
   * Returns a {@code com.google.protobuf.Timestamp} initialized to the same point in time as {@code
   * this}.
   */
  public com.google.protobuf.Timestamp toProto() {
    return com.google.protobuf.Timestamp.newBuilder().setSeconds(seconds).setNanos(nanos).build();
  }

  /** This method is obsolete. Use {@link #parseTimestampDuration(String)} instead */
  @ObsoleteApi("Use parseTimestampDuration(String) instead")
  public static Timestamp parseTimestamp(String timestamp) {
    try {
      return parseTimestampDuration(timestamp);
    } catch (DateTimeParseException ex) {
      throw new org.threeten.bp.format.DateTimeParseException(
          ex.getMessage(), ex.getParsedString(), ex.getErrorIndex());
    }
  }

  /**
   * Creates a Timestamp instance from the given string. Input string should be in the RFC 3339
   * format, like '2020-12-01T10:15:30.000Z' or with the timezone offset, such as
   * '2020-12-01T10:15:30+01:00'.
   *
   * @param timestamp string in the RFC 3339 format
   * @return created Timestamp
   * @throws DateTimeParseException if unable to parse
   */
  public static Timestamp parseTimestampDuration(String timestamp) {
    TemporalAccessor temporalAccessor = timestampParser.parse(timestamp);
    Instant instant = Instant.from(temporalAccessor);
    return ofTimeSecondsAndNanos(instant.getEpochSecond(), instant.getNano());
  }

  private StringBuilder toString(StringBuilder b) {
    format.formatTo(LocalDateTime.ofEpochSecond(seconds, 0, ZoneOffset.UTC), b);
    if (nanos != 0) {
      b.append(String.format(".%09d", nanos));
    }
    b.append('Z');
    return b;
  }

  @Override
  public String toString() {
    return toString(new StringBuilder()).toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timestamp that = (Timestamp) o;
    return seconds == that.seconds && nanos == that.nanos;
  }

  @Override
  public int hashCode() {
    return Objects.hash(seconds, nanos);
  }

  // TODO(user): Consider adding math operations.
}
