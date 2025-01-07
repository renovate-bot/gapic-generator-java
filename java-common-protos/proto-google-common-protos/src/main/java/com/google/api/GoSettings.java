/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/client.proto

// Protobuf Java Version: 3.25.5
package com.google.api;

/**
 *
 *
 * <pre>
 * Settings for Go client libraries.
 * </pre>
 *
 * Protobuf type {@code google.api.GoSettings}
 */
public final class GoSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.GoSettings)
    GoSettingsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GoSettings.newBuilder() to construct.
  private GoSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GoSettings() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GoSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.ClientProto.internal_static_google_api_GoSettings_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 2:
        return internalGetRenamedServices();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.ClientProto.internal_static_google_api_GoSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.GoSettings.class, com.google.api.GoSettings.Builder.class);
  }

  private int bitField0_;
  public static final int COMMON_FIELD_NUMBER = 1;
  private com.google.api.CommonLanguageSettings common_;
  /**
   *
   *
   * <pre>
   * Some settings.
   * </pre>
   *
   * <code>.google.api.CommonLanguageSettings common = 1;</code>
   *
   * @return Whether the common field is set.
   */
  @java.lang.Override
  public boolean hasCommon() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Some settings.
   * </pre>
   *
   * <code>.google.api.CommonLanguageSettings common = 1;</code>
   *
   * @return The common.
   */
  @java.lang.Override
  public com.google.api.CommonLanguageSettings getCommon() {
    return common_ == null ? com.google.api.CommonLanguageSettings.getDefaultInstance() : common_;
  }
  /**
   *
   *
   * <pre>
   * Some settings.
   * </pre>
   *
   * <code>.google.api.CommonLanguageSettings common = 1;</code>
   */
  @java.lang.Override
  public com.google.api.CommonLanguageSettingsOrBuilder getCommonOrBuilder() {
    return common_ == null ? com.google.api.CommonLanguageSettings.getDefaultInstance() : common_;
  }

  public static final int RENAMED_SERVICES_FIELD_NUMBER = 2;

  private static final class RenamedServicesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.api.ClientProto
                .internal_static_google_api_GoSettings_RenamedServicesEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> renamedServices_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
      internalGetRenamedServices() {
    if (renamedServices_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          RenamedServicesDefaultEntryHolder.defaultEntry);
    }
    return renamedServices_;
  }

  public int getRenamedServicesCount() {
    return internalGetRenamedServices().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Map of service names to renamed services. Keys are the package relative
   * service names and values are the name to be used for the service client
   * and call options.
   *
   * publishing:
   *   go_settings:
   *     renamed_services:
   *       Publisher: TopicAdmin
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_services = 2;</code>
   */
  @java.lang.Override
  public boolean containsRenamedServices(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetRenamedServices().getMap().containsKey(key);
  }
  /** Use {@link #getRenamedServicesMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getRenamedServices() {
    return getRenamedServicesMap();
  }
  /**
   *
   *
   * <pre>
   * Map of service names to renamed services. Keys are the package relative
   * service names and values are the name to be used for the service client
   * and call options.
   *
   * publishing:
   *   go_settings:
   *     renamed_services:
   *       Publisher: TopicAdmin
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_services = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getRenamedServicesMap() {
    return internalGetRenamedServices().getMap();
  }
  /**
   *
   *
   * <pre>
   * Map of service names to renamed services. Keys are the package relative
   * service names and values are the name to be used for the service client
   * and call options.
   *
   * publishing:
   *   go_settings:
   *     renamed_services:
   *       Publisher: TopicAdmin
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_services = 2;</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getRenamedServicesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetRenamedServices().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Map of service names to renamed services. Keys are the package relative
   * service names and values are the name to be used for the service client
   * and call options.
   *
   * publishing:
   *   go_settings:
   *     renamed_services:
   *       Publisher: TopicAdmin
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_services = 2;</code>
   */
  @java.lang.Override
  public java.lang.String getRenamedServicesOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetRenamedServices().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getCommon());
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetRenamedServices(), RenamedServicesDefaultEntryHolder.defaultEntry, 2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCommon());
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetRenamedServices().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> renamedServices__ =
          RenamedServicesDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, renamedServices__);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.api.GoSettings)) {
      return super.equals(obj);
    }
    com.google.api.GoSettings other = (com.google.api.GoSettings) obj;

    if (hasCommon() != other.hasCommon()) return false;
    if (hasCommon()) {
      if (!getCommon().equals(other.getCommon())) return false;
    }
    if (!internalGetRenamedServices().equals(other.internalGetRenamedServices())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCommon()) {
      hash = (37 * hash) + COMMON_FIELD_NUMBER;
      hash = (53 * hash) + getCommon().hashCode();
    }
    if (!internalGetRenamedServices().getMap().isEmpty()) {
      hash = (37 * hash) + RENAMED_SERVICES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetRenamedServices().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.GoSettings parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.GoSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.GoSettings parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.GoSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.GoSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.GoSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.GoSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.GoSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.GoSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.GoSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.GoSettings parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.GoSettings parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.api.GoSettings prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Settings for Go client libraries.
   * </pre>
   *
   * Protobuf type {@code google.api.GoSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.GoSettings)
      com.google.api.GoSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.ClientProto.internal_static_google_api_GoSettings_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetRenamedServices();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableRenamedServices();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.ClientProto.internal_static_google_api_GoSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.GoSettings.class, com.google.api.GoSettings.Builder.class);
    }

    // Construct using com.google.api.GoSettings.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getCommonFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      common_ = null;
      if (commonBuilder_ != null) {
        commonBuilder_.dispose();
        commonBuilder_ = null;
      }
      internalGetMutableRenamedServices().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.ClientProto.internal_static_google_api_GoSettings_descriptor;
    }

    @java.lang.Override
    public com.google.api.GoSettings getDefaultInstanceForType() {
      return com.google.api.GoSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.GoSettings build() {
      com.google.api.GoSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.GoSettings buildPartial() {
      com.google.api.GoSettings result = new com.google.api.GoSettings(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.GoSettings result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.common_ = commonBuilder_ == null ? common_ : commonBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.renamedServices_ = internalGetRenamedServices();
        result.renamedServices_.makeImmutable();
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.GoSettings) {
        return mergeFrom((com.google.api.GoSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.GoSettings other) {
      if (other == com.google.api.GoSettings.getDefaultInstance()) return this;
      if (other.hasCommon()) {
        mergeCommon(other.getCommon());
      }
      internalGetMutableRenamedServices().mergeFrom(other.internalGetRenamedServices());
      bitField0_ |= 0x00000002;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getCommonFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> renamedServices__ =
                    input.readMessage(
                        RenamedServicesDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableRenamedServices()
                    .getMutableMap()
                    .put(renamedServices__.getKey(), renamedServices__.getValue());
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.api.CommonLanguageSettings common_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.CommonLanguageSettings,
            com.google.api.CommonLanguageSettings.Builder,
            com.google.api.CommonLanguageSettingsOrBuilder>
        commonBuilder_;
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     *
     * @return Whether the common field is set.
     */
    public boolean hasCommon() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     *
     * @return The common.
     */
    public com.google.api.CommonLanguageSettings getCommon() {
      if (commonBuilder_ == null) {
        return common_ == null
            ? com.google.api.CommonLanguageSettings.getDefaultInstance()
            : common_;
      } else {
        return commonBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     */
    public Builder setCommon(com.google.api.CommonLanguageSettings value) {
      if (commonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        common_ = value;
      } else {
        commonBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     */
    public Builder setCommon(com.google.api.CommonLanguageSettings.Builder builderForValue) {
      if (commonBuilder_ == null) {
        common_ = builderForValue.build();
      } else {
        commonBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     */
    public Builder mergeCommon(com.google.api.CommonLanguageSettings value) {
      if (commonBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && common_ != null
            && common_ != com.google.api.CommonLanguageSettings.getDefaultInstance()) {
          getCommonBuilder().mergeFrom(value);
        } else {
          common_ = value;
        }
      } else {
        commonBuilder_.mergeFrom(value);
      }
      if (common_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     */
    public Builder clearCommon() {
      bitField0_ = (bitField0_ & ~0x00000001);
      common_ = null;
      if (commonBuilder_ != null) {
        commonBuilder_.dispose();
        commonBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     */
    public com.google.api.CommonLanguageSettings.Builder getCommonBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCommonFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     */
    public com.google.api.CommonLanguageSettingsOrBuilder getCommonOrBuilder() {
      if (commonBuilder_ != null) {
        return commonBuilder_.getMessageOrBuilder();
      } else {
        return common_ == null
            ? com.google.api.CommonLanguageSettings.getDefaultInstance()
            : common_;
      }
    }
    /**
     *
     *
     * <pre>
     * Some settings.
     * </pre>
     *
     * <code>.google.api.CommonLanguageSettings common = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.CommonLanguageSettings,
            com.google.api.CommonLanguageSettings.Builder,
            com.google.api.CommonLanguageSettingsOrBuilder>
        getCommonFieldBuilder() {
      if (commonBuilder_ == null) {
        commonBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.api.CommonLanguageSettings,
                com.google.api.CommonLanguageSettings.Builder,
                com.google.api.CommonLanguageSettingsOrBuilder>(
                getCommon(), getParentForChildren(), isClean());
        common_ = null;
      }
      return commonBuilder_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> renamedServices_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetRenamedServices() {
      if (renamedServices_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            RenamedServicesDefaultEntryHolder.defaultEntry);
      }
      return renamedServices_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableRenamedServices() {
      if (renamedServices_ == null) {
        renamedServices_ =
            com.google.protobuf.MapField.newMapField(
                RenamedServicesDefaultEntryHolder.defaultEntry);
      }
      if (!renamedServices_.isMutable()) {
        renamedServices_ = renamedServices_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return renamedServices_;
    }

    public int getRenamedServicesCount() {
      return internalGetRenamedServices().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Map of service names to renamed services. Keys are the package relative
     * service names and values are the name to be used for the service client
     * and call options.
     *
     * publishing:
     *   go_settings:
     *     renamed_services:
     *       Publisher: TopicAdmin
     * </pre>
     *
     * <code>map&lt;string, string&gt; renamed_services = 2;</code>
     */
    @java.lang.Override
    public boolean containsRenamedServices(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetRenamedServices().getMap().containsKey(key);
    }
    /** Use {@link #getRenamedServicesMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getRenamedServices() {
      return getRenamedServicesMap();
    }
    /**
     *
     *
     * <pre>
     * Map of service names to renamed services. Keys are the package relative
     * service names and values are the name to be used for the service client
     * and call options.
     *
     * publishing:
     *   go_settings:
     *     renamed_services:
     *       Publisher: TopicAdmin
     * </pre>
     *
     * <code>map&lt;string, string&gt; renamed_services = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getRenamedServicesMap() {
      return internalGetRenamedServices().getMap();
    }
    /**
     *
     *
     * <pre>
     * Map of service names to renamed services. Keys are the package relative
     * service names and values are the name to be used for the service client
     * and call options.
     *
     * publishing:
     *   go_settings:
     *     renamed_services:
     *       Publisher: TopicAdmin
     * </pre>
     *
     * <code>map&lt;string, string&gt; renamed_services = 2;</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getRenamedServicesOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetRenamedServices().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Map of service names to renamed services. Keys are the package relative
     * service names and values are the name to be used for the service client
     * and call options.
     *
     * publishing:
     *   go_settings:
     *     renamed_services:
     *       Publisher: TopicAdmin
     * </pre>
     *
     * <code>map&lt;string, string&gt; renamed_services = 2;</code>
     */
    @java.lang.Override
    public java.lang.String getRenamedServicesOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetRenamedServices().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearRenamedServices() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableRenamedServices().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map of service names to renamed services. Keys are the package relative
     * service names and values are the name to be used for the service client
     * and call options.
     *
     * publishing:
     *   go_settings:
     *     renamed_services:
     *       Publisher: TopicAdmin
     * </pre>
     *
     * <code>map&lt;string, string&gt; renamed_services = 2;</code>
     */
    public Builder removeRenamedServices(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableRenamedServices().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableRenamedServices() {
      bitField0_ |= 0x00000002;
      return internalGetMutableRenamedServices().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Map of service names to renamed services. Keys are the package relative
     * service names and values are the name to be used for the service client
     * and call options.
     *
     * publishing:
     *   go_settings:
     *     renamed_services:
     *       Publisher: TopicAdmin
     * </pre>
     *
     * <code>map&lt;string, string&gt; renamed_services = 2;</code>
     */
    public Builder putRenamedServices(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableRenamedServices().getMutableMap().put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map of service names to renamed services. Keys are the package relative
     * service names and values are the name to be used for the service client
     * and call options.
     *
     * publishing:
     *   go_settings:
     *     renamed_services:
     *       Publisher: TopicAdmin
     * </pre>
     *
     * <code>map&lt;string, string&gt; renamed_services = 2;</code>
     */
    public Builder putAllRenamedServices(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableRenamedServices().getMutableMap().putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.api.GoSettings)
  }

  // @@protoc_insertion_point(class_scope:google.api.GoSettings)
  private static final com.google.api.GoSettings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.GoSettings();
  }

  public static com.google.api.GoSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GoSettings> PARSER =
      new com.google.protobuf.AbstractParser<GoSettings>() {
        @java.lang.Override
        public GoSettings parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<GoSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GoSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.GoSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
