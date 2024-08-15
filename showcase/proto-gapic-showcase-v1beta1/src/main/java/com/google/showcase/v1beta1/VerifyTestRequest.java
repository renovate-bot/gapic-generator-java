// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/testing.proto

// Protobuf Java Version: 3.25.4
package com.google.showcase.v1beta1;

/**
 * Protobuf type {@code google.showcase.v1beta1.VerifyTestRequest}
 */
public final class VerifyTestRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.showcase.v1beta1.VerifyTestRequest)
    VerifyTestRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VerifyTestRequest.newBuilder() to construct.
  private VerifyTestRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VerifyTestRequest() {
    name_ = "";
    answer_ = com.google.protobuf.ByteString.EMPTY;
    answers_ = emptyList(com.google.protobuf.ByteString.class);
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VerifyTestRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_VerifyTestRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_VerifyTestRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.showcase.v1beta1.VerifyTestRequest.class, com.google.showcase.v1beta1.VerifyTestRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The test to have an answer registered to it.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The test to have an answer registered to it.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ANSWER_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString answer_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * The answer from the test.
   * </pre>
   *
   * <code>bytes answer = 2;</code>
   * @return The answer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAnswer() {
    return answer_;
  }

  public static final int ANSWERS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.ByteString> answers_ =
      emptyList(com.google.protobuf.ByteString.class);
  /**
   * <pre>
   * The answers from the test if multiple are to be checked
   * </pre>
   *
   * <code>repeated bytes answers = 3;</code>
   * @return A list containing the answers.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
      getAnswersList() {
    return answers_;
  }
  /**
   * <pre>
   * The answers from the test if multiple are to be checked
   * </pre>
   *
   * <code>repeated bytes answers = 3;</code>
   * @return The count of answers.
   */
  public int getAnswersCount() {
    return answers_.size();
  }
  /**
   * <pre>
   * The answers from the test if multiple are to be checked
   * </pre>
   *
   * <code>repeated bytes answers = 3;</code>
   * @param index The index of the element to return.
   * @return The answers at the given index.
   */
  public com.google.protobuf.ByteString getAnswers(int index) {
    return answers_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!answer_.isEmpty()) {
      output.writeBytes(2, answer_);
    }
    for (int i = 0; i < answers_.size(); i++) {
      output.writeBytes(3, answers_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!answer_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, answer_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < answers_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(answers_.get(i));
      }
      size += dataSize;
      size += 1 * getAnswersList().size();
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
    if (!(obj instanceof com.google.showcase.v1beta1.VerifyTestRequest)) {
      return super.equals(obj);
    }
    com.google.showcase.v1beta1.VerifyTestRequest other = (com.google.showcase.v1beta1.VerifyTestRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getAnswer()
        .equals(other.getAnswer())) return false;
    if (!getAnswersList()
        .equals(other.getAnswersList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ANSWER_FIELD_NUMBER;
    hash = (53 * hash) + getAnswer().hashCode();
    if (getAnswersCount() > 0) {
      hash = (37 * hash) + ANSWERS_FIELD_NUMBER;
      hash = (53 * hash) + getAnswersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.showcase.v1beta1.VerifyTestRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.VerifyTestRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.VerifyTestRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.VerifyTestRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.VerifyTestRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.VerifyTestRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.VerifyTestRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.VerifyTestRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.VerifyTestRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.showcase.v1beta1.VerifyTestRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.VerifyTestRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.VerifyTestRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.showcase.v1beta1.VerifyTestRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.showcase.v1beta1.VerifyTestRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.showcase.v1beta1.VerifyTestRequest)
      com.google.showcase.v1beta1.VerifyTestRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_VerifyTestRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_VerifyTestRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.showcase.v1beta1.VerifyTestRequest.class, com.google.showcase.v1beta1.VerifyTestRequest.Builder.class);
    }

    // Construct using com.google.showcase.v1beta1.VerifyTestRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      answer_ = com.google.protobuf.ByteString.EMPTY;
      answers_ = emptyList(com.google.protobuf.ByteString.class);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.showcase.v1beta1.TestingOuterClass.internal_static_google_showcase_v1beta1_VerifyTestRequest_descriptor;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.VerifyTestRequest getDefaultInstanceForType() {
      return com.google.showcase.v1beta1.VerifyTestRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.VerifyTestRequest build() {
      com.google.showcase.v1beta1.VerifyTestRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.VerifyTestRequest buildPartial() {
      com.google.showcase.v1beta1.VerifyTestRequest result = new com.google.showcase.v1beta1.VerifyTestRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.showcase.v1beta1.VerifyTestRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.answer_ = answer_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        answers_.makeImmutable();
        result.answers_ = answers_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.showcase.v1beta1.VerifyTestRequest) {
        return mergeFrom((com.google.showcase.v1beta1.VerifyTestRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.showcase.v1beta1.VerifyTestRequest other) {
      if (other == com.google.showcase.v1beta1.VerifyTestRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getAnswer() != com.google.protobuf.ByteString.EMPTY) {
        setAnswer(other.getAnswer());
      }
      if (!other.answers_.isEmpty()) {
        if (answers_.isEmpty()) {
          answers_ = other.answers_;
          answers_.makeImmutable();
          bitField0_ |= 0x00000004;
        } else {
          ensureAnswersIsMutable();
          answers_.addAll(other.answers_);
        }
        onChanged();
      }
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
            case 10: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              answer_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              com.google.protobuf.ByteString v = input.readBytes();
              ensureAnswersIsMutable();
              answers_.add(v);
              break;
            } // case 26
            default: {
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The test to have an answer registered to it.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The test to have an answer registered to it.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The test to have an answer registered to it.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The test to have an answer registered to it.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The test to have an answer registered to it.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString answer_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The answer from the test.
     * </pre>
     *
     * <code>bytes answer = 2;</code>
     * @return The answer.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAnswer() {
      return answer_;
    }
    /**
     * <pre>
     * The answer from the test.
     * </pre>
     *
     * <code>bytes answer = 2;</code>
     * @param value The answer to set.
     * @return This builder for chaining.
     */
    public Builder setAnswer(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      answer_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The answer from the test.
     * </pre>
     *
     * <code>bytes answer = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnswer() {
      bitField0_ = (bitField0_ & ~0x00000002);
      answer_ = getDefaultInstance().getAnswer();
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.ByteString> answers_ = emptyList(com.google.protobuf.ByteString.class);
    private void ensureAnswersIsMutable() {
      if (!answers_.isModifiable()) {
        answers_ = makeMutableCopy(answers_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <pre>
     * The answers from the test if multiple are to be checked
     * </pre>
     *
     * <code>repeated bytes answers = 3;</code>
     * @return A list containing the answers.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getAnswersList() {
      answers_.makeImmutable();
      return answers_;
    }
    /**
     * <pre>
     * The answers from the test if multiple are to be checked
     * </pre>
     *
     * <code>repeated bytes answers = 3;</code>
     * @return The count of answers.
     */
    public int getAnswersCount() {
      return answers_.size();
    }
    /**
     * <pre>
     * The answers from the test if multiple are to be checked
     * </pre>
     *
     * <code>repeated bytes answers = 3;</code>
     * @param index The index of the element to return.
     * @return The answers at the given index.
     */
    public com.google.protobuf.ByteString getAnswers(int index) {
      return answers_.get(index);
    }
    /**
     * <pre>
     * The answers from the test if multiple are to be checked
     * </pre>
     *
     * <code>repeated bytes answers = 3;</code>
     * @param index The index to set the value at.
     * @param value The answers to set.
     * @return This builder for chaining.
     */
    public Builder setAnswers(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAnswersIsMutable();
      answers_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The answers from the test if multiple are to be checked
     * </pre>
     *
     * <code>repeated bytes answers = 3;</code>
     * @param value The answers to add.
     * @return This builder for chaining.
     */
    public Builder addAnswers(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAnswersIsMutable();
      answers_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The answers from the test if multiple are to be checked
     * </pre>
     *
     * <code>repeated bytes answers = 3;</code>
     * @param values The answers to add.
     * @return This builder for chaining.
     */
    public Builder addAllAnswers(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureAnswersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, answers_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The answers from the test if multiple are to be checked
     * </pre>
     *
     * <code>repeated bytes answers = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnswers() {
      answers_ = emptyList(com.google.protobuf.ByteString.class);
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.showcase.v1beta1.VerifyTestRequest)
  }

  // @@protoc_insertion_point(class_scope:google.showcase.v1beta1.VerifyTestRequest)
  private static final com.google.showcase.v1beta1.VerifyTestRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.showcase.v1beta1.VerifyTestRequest();
  }

  public static com.google.showcase.v1beta1.VerifyTestRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VerifyTestRequest>
      PARSER = new com.google.protobuf.AbstractParser<VerifyTestRequest>() {
    @java.lang.Override
    public VerifyTestRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<VerifyTestRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VerifyTestRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.showcase.v1beta1.VerifyTestRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

