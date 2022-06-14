// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Request.VodDescribeIPInfoRequest}
 */
public final class VodDescribeIPInfoRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Request.VodDescribeIPInfoRequest)
    VodDescribeIPInfoRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodDescribeIPInfoRequest.newBuilder() to construct.
  private VodDescribeIPInfoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodDescribeIPInfoRequest() {
    ips_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodDescribeIPInfoRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodDescribeIPInfoRequest(
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

            ips_ = s;
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
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeIPInfoRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeIPInfoRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest.class, com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest.Builder.class);
  }

  public static final int IPS_FIELD_NUMBER = 1;
  private volatile java.lang.Object ips_;
  /**
   * <pre>
   *ip，多个用逗号隔开
   * </pre>
   *
   * <code>string Ips = 1;</code>
   * @return The ips.
   */
  @java.lang.Override
  public java.lang.String getIps() {
    java.lang.Object ref = ips_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ips_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *ip，多个用逗号隔开
   * </pre>
   *
   * <code>string Ips = 1;</code>
   * @return The bytes for ips.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIpsBytes() {
    java.lang.Object ref = ips_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ips_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ips_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ips_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ips_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ips_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest other = (com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest) obj;

    if (!getIps()
        .equals(other.getIps())) return false;
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
    hash = (37 * hash) + IPS_FIELD_NUMBER;
    hash = (53 * hash) + getIps().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Request.VodDescribeIPInfoRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Request.VodDescribeIPInfoRequest)
      com.volcengine.service.vod.model.request.VodDescribeIPInfoRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeIPInfoRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeIPInfoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest.class, com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest.newBuilder()
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
      ips_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeIPInfoRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest build() {
      com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest buildPartial() {
      com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest result = new com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest(this);
      result.ips_ = ips_;
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
      if (other instanceof com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest) {
        return mergeFrom((com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest other) {
      if (other == com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest.getDefaultInstance()) return this;
      if (!other.getIps().isEmpty()) {
        ips_ = other.ips_;
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
      com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ips_ = "";
    /**
     * <pre>
     *ip，多个用逗号隔开
     * </pre>
     *
     * <code>string Ips = 1;</code>
     * @return The ips.
     */
    public java.lang.String getIps() {
      java.lang.Object ref = ips_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ips_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *ip，多个用逗号隔开
     * </pre>
     *
     * <code>string Ips = 1;</code>
     * @return The bytes for ips.
     */
    public com.google.protobuf.ByteString
        getIpsBytes() {
      java.lang.Object ref = ips_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ips_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *ip，多个用逗号隔开
     * </pre>
     *
     * <code>string Ips = 1;</code>
     * @param value The ips to set.
     * @return This builder for chaining.
     */
    public Builder setIps(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ips_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *ip，多个用逗号隔开
     * </pre>
     *
     * <code>string Ips = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIps() {
      
      ips_ = getDefaultInstance().getIps();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *ip，多个用逗号隔开
     * </pre>
     *
     * <code>string Ips = 1;</code>
     * @param value The bytes for ips to set.
     * @return This builder for chaining.
     */
    public Builder setIpsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ips_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Request.VodDescribeIPInfoRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Request.VodDescribeIPInfoRequest)
  private static final com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest();
  }

  public static com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodDescribeIPInfoRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodDescribeIPInfoRequest>() {
    @java.lang.Override
    public VodDescribeIPInfoRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodDescribeIPInfoRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodDescribeIPInfoRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodDescribeIPInfoRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

