// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Request.VodDescribeDrmDataKeyRequest}
 */
public final class VodDescribeDrmDataKeyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Request.VodDescribeDrmDataKeyRequest)
    VodDescribeDrmDataKeyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodDescribeDrmDataKeyRequest.newBuilder() to construct.
  private VodDescribeDrmDataKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodDescribeDrmDataKeyRequest() {
    ak_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodDescribeDrmDataKeyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodDescribeDrmDataKeyRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            ak_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeDrmDataKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeDrmDataKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest.class, com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest.Builder.class);
  }

  public static final int AK_FIELD_NUMBER = 1;
  private volatile java.lang.Object ak_;
  /**
   * <pre>
   * KeyId
   * </pre>
   *
   * <code>string Ak = 1;</code>
   * @return The ak.
   */
  @java.lang.Override
  public java.lang.String getAk() {
    java.lang.Object ref = ak_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ak_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * KeyId
   * </pre>
   *
   * <code>string Ak = 1;</code>
   * @return The bytes for ak.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAkBytes() {
    java.lang.Object ref = ak_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ak_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ak_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ak_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ak_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ak_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest other = (com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest) obj;

    if (!getAk()
        .equals(other.getAk())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AK_FIELD_NUMBER;
    hash = (53 * hash) + getAk().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Request.VodDescribeDrmDataKeyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Request.VodDescribeDrmDataKeyRequest)
      com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeDrmDataKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeDrmDataKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest.class, com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      ak_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeDrmDataKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest build() {
      com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest buildPartial() {
      com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest result = new com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest(this);
      result.ak_ = ak_;
      onBuilt();
      return result;
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
      if (other instanceof com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest) {
        return mergeFrom((com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest other) {
      if (other == com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest.getDefaultInstance()) return this;
      if (!other.getAk().isEmpty()) {
        ak_ = other.ak_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ak_ = "";
    /**
     * <pre>
     * KeyId
     * </pre>
     *
     * <code>string Ak = 1;</code>
     * @return The ak.
     */
    public java.lang.String getAk() {
      java.lang.Object ref = ak_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ak_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * KeyId
     * </pre>
     *
     * <code>string Ak = 1;</code>
     * @return The bytes for ak.
     */
    public com.google.protobuf.ByteString
        getAkBytes() {
      java.lang.Object ref = ak_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ak_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * KeyId
     * </pre>
     *
     * <code>string Ak = 1;</code>
     * @param value The ak to set.
     * @return This builder for chaining.
     */
    public Builder setAk(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ak_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * KeyId
     * </pre>
     *
     * <code>string Ak = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAk() {
      
      ak_ = getDefaultInstance().getAk();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * KeyId
     * </pre>
     *
     * <code>string Ak = 1;</code>
     * @param value The bytes for ak to set.
     * @return This builder for chaining.
     */
    public Builder setAkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ak_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Request.VodDescribeDrmDataKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Request.VodDescribeDrmDataKeyRequest)
  private static final com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest();
  }

  public static com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodDescribeDrmDataKeyRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodDescribeDrmDataKeyRequest>() {
    @java.lang.Override
    public VodDescribeDrmDataKeyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodDescribeDrmDataKeyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodDescribeDrmDataKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodDescribeDrmDataKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.request.VodDescribeDrmDataKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
