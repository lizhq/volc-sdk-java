// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Request.VodListCdnAccessLogRequest}
 */
public final class VodListCdnAccessLogRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Request.VodListCdnAccessLogRequest)
    VodListCdnAccessLogRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodListCdnAccessLogRequest.newBuilder() to construct.
  private VodListCdnAccessLogRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodListCdnAccessLogRequest() {
    domains_ = "";
    spaceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodListCdnAccessLogRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodListCdnAccessLogRequest(
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

            domains_ = s;
            break;
          }
          case 16: {

            startTimestamp_ = input.readInt32();
            break;
          }
          case 24: {

            endTimestamp_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            spaceName_ = s;
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
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListCdnAccessLogRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListCdnAccessLogRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest.class, com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest.Builder.class);
  }

  public static final int DOMAINS_FIELD_NUMBER = 1;
  private volatile java.lang.Object domains_;
  /**
   * <pre>
   * 域名（当前仅支持设置一个域名） 
   * </pre>
   *
   * <code>string Domains = 1;</code>
   * @return The domains.
   */
  @java.lang.Override
  public java.lang.String getDomains() {
    java.lang.Object ref = domains_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      domains_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 域名（当前仅支持设置一个域名） 
   * </pre>
   *
   * <code>string Domains = 1;</code>
   * @return The bytes for domains.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDomainsBytes() {
    java.lang.Object ref = domains_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      domains_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STARTTIMESTAMP_FIELD_NUMBER = 2;
  private int startTimestamp_;
  /**
   * <pre>
   * 查询起始时间戳，单位：Unix秒级时间戳 
   * </pre>
   *
   * <code>int32 StartTimestamp = 2;</code>
   * @return The startTimestamp.
   */
  @java.lang.Override
  public int getStartTimestamp() {
    return startTimestamp_;
  }

  public static final int ENDTIMESTAMP_FIELD_NUMBER = 3;
  private int endTimestamp_;
  /**
   * <pre>
   * 查询结束时间戳，单位：Unix秒级时间戳 
   * </pre>
   *
   * <code>int32 EndTimestamp = 3;</code>
   * @return The endTimestamp.
   */
  @java.lang.Override
  public int getEndTimestamp() {
    return endTimestamp_;
  }

  public static final int SPACENAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object spaceName_;
  /**
   * <pre>
   * 空间名称 
   * </pre>
   *
   * <code>string SpaceName = 4;</code>
   * @return The spaceName.
   */
  @java.lang.Override
  public java.lang.String getSpaceName() {
    java.lang.Object ref = spaceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      spaceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 空间名称 
   * </pre>
   *
   * <code>string SpaceName = 4;</code>
   * @return The bytes for spaceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSpaceNameBytes() {
    java.lang.Object ref = spaceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      spaceName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domains_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, domains_);
    }
    if (startTimestamp_ != 0) {
      output.writeInt32(2, startTimestamp_);
    }
    if (endTimestamp_ != 0) {
      output.writeInt32(3, endTimestamp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(spaceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, spaceName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domains_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, domains_);
    }
    if (startTimestamp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, startTimestamp_);
    }
    if (endTimestamp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, endTimestamp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(spaceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, spaceName_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest other = (com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest) obj;

    if (!getDomains()
        .equals(other.getDomains())) return false;
    if (getStartTimestamp()
        != other.getStartTimestamp()) return false;
    if (getEndTimestamp()
        != other.getEndTimestamp()) return false;
    if (!getSpaceName()
        .equals(other.getSpaceName())) return false;
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
    hash = (37 * hash) + DOMAINS_FIELD_NUMBER;
    hash = (53 * hash) + getDomains().hashCode();
    hash = (37 * hash) + STARTTIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getStartTimestamp();
    hash = (37 * hash) + ENDTIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getEndTimestamp();
    hash = (37 * hash) + SPACENAME_FIELD_NUMBER;
    hash = (53 * hash) + getSpaceName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Request.VodListCdnAccessLogRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Request.VodListCdnAccessLogRequest)
      com.volcengine.service.vod.model.request.VodListCdnAccessLogRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListCdnAccessLogRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListCdnAccessLogRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest.class, com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest.newBuilder()
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
      domains_ = "";

      startTimestamp_ = 0;

      endTimestamp_ = 0;

      spaceName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListCdnAccessLogRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest build() {
      com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest buildPartial() {
      com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest result = new com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest(this);
      result.domains_ = domains_;
      result.startTimestamp_ = startTimestamp_;
      result.endTimestamp_ = endTimestamp_;
      result.spaceName_ = spaceName_;
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
      if (other instanceof com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest) {
        return mergeFrom((com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest other) {
      if (other == com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest.getDefaultInstance()) return this;
      if (!other.getDomains().isEmpty()) {
        domains_ = other.domains_;
        onChanged();
      }
      if (other.getStartTimestamp() != 0) {
        setStartTimestamp(other.getStartTimestamp());
      }
      if (other.getEndTimestamp() != 0) {
        setEndTimestamp(other.getEndTimestamp());
      }
      if (!other.getSpaceName().isEmpty()) {
        spaceName_ = other.spaceName_;
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
      com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object domains_ = "";
    /**
     * <pre>
     * 域名（当前仅支持设置一个域名） 
     * </pre>
     *
     * <code>string Domains = 1;</code>
     * @return The domains.
     */
    public java.lang.String getDomains() {
      java.lang.Object ref = domains_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        domains_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 域名（当前仅支持设置一个域名） 
     * </pre>
     *
     * <code>string Domains = 1;</code>
     * @return The bytes for domains.
     */
    public com.google.protobuf.ByteString
        getDomainsBytes() {
      java.lang.Object ref = domains_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        domains_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 域名（当前仅支持设置一个域名） 
     * </pre>
     *
     * <code>string Domains = 1;</code>
     * @param value The domains to set.
     * @return This builder for chaining.
     */
    public Builder setDomains(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      domains_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 域名（当前仅支持设置一个域名） 
     * </pre>
     *
     * <code>string Domains = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDomains() {
      
      domains_ = getDefaultInstance().getDomains();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 域名（当前仅支持设置一个域名） 
     * </pre>
     *
     * <code>string Domains = 1;</code>
     * @param value The bytes for domains to set.
     * @return This builder for chaining.
     */
    public Builder setDomainsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      domains_ = value;
      onChanged();
      return this;
    }

    private int startTimestamp_ ;
    /**
     * <pre>
     * 查询起始时间戳，单位：Unix秒级时间戳 
     * </pre>
     *
     * <code>int32 StartTimestamp = 2;</code>
     * @return The startTimestamp.
     */
    @java.lang.Override
    public int getStartTimestamp() {
      return startTimestamp_;
    }
    /**
     * <pre>
     * 查询起始时间戳，单位：Unix秒级时间戳 
     * </pre>
     *
     * <code>int32 StartTimestamp = 2;</code>
     * @param value The startTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setStartTimestamp(int value) {
      
      startTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 查询起始时间戳，单位：Unix秒级时间戳 
     * </pre>
     *
     * <code>int32 StartTimestamp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTimestamp() {
      
      startTimestamp_ = 0;
      onChanged();
      return this;
    }

    private int endTimestamp_ ;
    /**
     * <pre>
     * 查询结束时间戳，单位：Unix秒级时间戳 
     * </pre>
     *
     * <code>int32 EndTimestamp = 3;</code>
     * @return The endTimestamp.
     */
    @java.lang.Override
    public int getEndTimestamp() {
      return endTimestamp_;
    }
    /**
     * <pre>
     * 查询结束时间戳，单位：Unix秒级时间戳 
     * </pre>
     *
     * <code>int32 EndTimestamp = 3;</code>
     * @param value The endTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setEndTimestamp(int value) {
      
      endTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 查询结束时间戳，单位：Unix秒级时间戳 
     * </pre>
     *
     * <code>int32 EndTimestamp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndTimestamp() {
      
      endTimestamp_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object spaceName_ = "";
    /**
     * <pre>
     * 空间名称 
     * </pre>
     *
     * <code>string SpaceName = 4;</code>
     * @return The spaceName.
     */
    public java.lang.String getSpaceName() {
      java.lang.Object ref = spaceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        spaceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 空间名称 
     * </pre>
     *
     * <code>string SpaceName = 4;</code>
     * @return The bytes for spaceName.
     */
    public com.google.protobuf.ByteString
        getSpaceNameBytes() {
      java.lang.Object ref = spaceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spaceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 空间名称 
     * </pre>
     *
     * <code>string SpaceName = 4;</code>
     * @param value The spaceName to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      spaceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 空间名称 
     * </pre>
     *
     * <code>string SpaceName = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpaceName() {
      
      spaceName_ = getDefaultInstance().getSpaceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 空间名称 
     * </pre>
     *
     * <code>string SpaceName = 4;</code>
     * @param value The bytes for spaceName to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      spaceName_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Request.VodListCdnAccessLogRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Request.VodListCdnAccessLogRequest)
  private static final com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest();
  }

  public static com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodListCdnAccessLogRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodListCdnAccessLogRequest>() {
    @java.lang.Override
    public VodListCdnAccessLogRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodListCdnAccessLogRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodListCdnAccessLogRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodListCdnAccessLogRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.request.VodListCdnAccessLogRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

