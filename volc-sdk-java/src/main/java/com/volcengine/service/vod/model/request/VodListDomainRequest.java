// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Request.VodListDomainRequest}
 */
public final class VodListDomainRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Request.VodListDomainRequest)
    VodListDomainRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodListDomainRequest.newBuilder() to construct.
  private VodListDomainRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodListDomainRequest() {
    spaceName_ = "";
    domainType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodListDomainRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodListDomainRequest(
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

            spaceName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            domainType_ = s;
            break;
          }
          case 24: {

            sourceStationType_ = input.readInt32();
            break;
          }
          case 32: {

            offset_ = input.readInt32();
            break;
          }
          case 40: {

            limit_ = input.readInt32();
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
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListDomainRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListDomainRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.request.VodListDomainRequest.class, com.volcengine.service.vod.model.request.VodListDomainRequest.Builder.class);
  }

  public static final int SPACENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object spaceName_;
  /**
   * <pre>
   * 空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
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
   * 空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
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

  public static final int DOMAINTYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object domainType_;
  /**
   * <pre>
   *域名类型
   *播放域名:play
   *封面域名:image
   * </pre>
   *
   * <code>string DomainType = 2;</code>
   * @return The domainType.
   */
  @java.lang.Override
  public java.lang.String getDomainType() {
    java.lang.Object ref = domainType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      domainType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *域名类型
   *播放域名:play
   *封面域名:image
   * </pre>
   *
   * <code>string DomainType = 2;</code>
   * @return The bytes for domainType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDomainTypeBytes() {
    java.lang.Object ref = domainType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      domainType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCESTATIONTYPE_FIELD_NUMBER = 3;
  private int sourceStationType_;
  /**
   * <pre>
   *源站类型
   *回点播源站:1
   *第三方源站:2
   * </pre>
   *
   * <code>int32 SourceStationType = 3;</code>
   * @return The sourceStationType.
   */
  @java.lang.Override
  public int getSourceStationType() {
    return sourceStationType_;
  }

  public static final int OFFSET_FIELD_NUMBER = 4;
  private int offset_;
  /**
   * <pre>
   *跳过域名组的游标
   * </pre>
   *
   * <code>int32 Offset = 4;</code>
   * @return The offset.
   */
  @java.lang.Override
  public int getOffset() {
    return offset_;
  }

  public static final int LIMIT_FIELD_NUMBER = 5;
  private int limit_;
  /**
   * <pre>
   *单次查询域名组数量
   * </pre>
   *
   * <code>int32 Limit = 5;</code>
   * @return The limit.
   */
  @java.lang.Override
  public int getLimit() {
    return limit_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(spaceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, spaceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domainType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, domainType_);
    }
    if (sourceStationType_ != 0) {
      output.writeInt32(3, sourceStationType_);
    }
    if (offset_ != 0) {
      output.writeInt32(4, offset_);
    }
    if (limit_ != 0) {
      output.writeInt32(5, limit_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(spaceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, spaceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domainType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, domainType_);
    }
    if (sourceStationType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, sourceStationType_);
    }
    if (offset_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, offset_);
    }
    if (limit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, limit_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.request.VodListDomainRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.request.VodListDomainRequest other = (com.volcengine.service.vod.model.request.VodListDomainRequest) obj;

    if (!getSpaceName()
        .equals(other.getSpaceName())) return false;
    if (!getDomainType()
        .equals(other.getDomainType())) return false;
    if (getSourceStationType()
        != other.getSourceStationType()) return false;
    if (getOffset()
        != other.getOffset()) return false;
    if (getLimit()
        != other.getLimit()) return false;
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
    hash = (37 * hash) + SPACENAME_FIELD_NUMBER;
    hash = (53 * hash) + getSpaceName().hashCode();
    hash = (37 * hash) + DOMAINTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDomainType().hashCode();
    hash = (37 * hash) + SOURCESTATIONTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getSourceStationType();
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getOffset();
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getLimit();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.request.VodListDomainRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodListDomainRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListDomainRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodListDomainRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListDomainRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodListDomainRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListDomainRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodListDomainRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListDomainRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodListDomainRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodListDomainRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodListDomainRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.request.VodListDomainRequest prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Request.VodListDomainRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Request.VodListDomainRequest)
      com.volcengine.service.vod.model.request.VodListDomainRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListDomainRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListDomainRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.request.VodListDomainRequest.class, com.volcengine.service.vod.model.request.VodListDomainRequest.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.request.VodListDomainRequest.newBuilder()
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
      spaceName_ = "";

      domainType_ = "";

      sourceStationType_ = 0;

      offset_ = 0;

      limit_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodListDomainRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodListDomainRequest getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.request.VodListDomainRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodListDomainRequest build() {
      com.volcengine.service.vod.model.request.VodListDomainRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodListDomainRequest buildPartial() {
      com.volcengine.service.vod.model.request.VodListDomainRequest result = new com.volcengine.service.vod.model.request.VodListDomainRequest(this);
      result.spaceName_ = spaceName_;
      result.domainType_ = domainType_;
      result.sourceStationType_ = sourceStationType_;
      result.offset_ = offset_;
      result.limit_ = limit_;
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
      if (other instanceof com.volcengine.service.vod.model.request.VodListDomainRequest) {
        return mergeFrom((com.volcengine.service.vod.model.request.VodListDomainRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.request.VodListDomainRequest other) {
      if (other == com.volcengine.service.vod.model.request.VodListDomainRequest.getDefaultInstance()) return this;
      if (!other.getSpaceName().isEmpty()) {
        spaceName_ = other.spaceName_;
        onChanged();
      }
      if (!other.getDomainType().isEmpty()) {
        domainType_ = other.domainType_;
        onChanged();
      }
      if (other.getSourceStationType() != 0) {
        setSourceStationType(other.getSourceStationType());
      }
      if (other.getOffset() != 0) {
        setOffset(other.getOffset());
      }
      if (other.getLimit() != 0) {
        setLimit(other.getLimit());
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
      com.volcengine.service.vod.model.request.VodListDomainRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.request.VodListDomainRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object spaceName_ = "";
    /**
     * <pre>
     * 空间名 
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
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
     * 空间名 
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
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
     * 空间名 
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
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
     * 空间名 
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpaceName() {
      
      spaceName_ = getDefaultInstance().getSpaceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 空间名 
     * </pre>
     *
     * <code>string SpaceName = 1;</code>
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

    private java.lang.Object domainType_ = "";
    /**
     * <pre>
     *域名类型
     *播放域名:play
     *封面域名:image
     * </pre>
     *
     * <code>string DomainType = 2;</code>
     * @return The domainType.
     */
    public java.lang.String getDomainType() {
      java.lang.Object ref = domainType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        domainType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *域名类型
     *播放域名:play
     *封面域名:image
     * </pre>
     *
     * <code>string DomainType = 2;</code>
     * @return The bytes for domainType.
     */
    public com.google.protobuf.ByteString
        getDomainTypeBytes() {
      java.lang.Object ref = domainType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        domainType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *域名类型
     *播放域名:play
     *封面域名:image
     * </pre>
     *
     * <code>string DomainType = 2;</code>
     * @param value The domainType to set.
     * @return This builder for chaining.
     */
    public Builder setDomainType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      domainType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *域名类型
     *播放域名:play
     *封面域名:image
     * </pre>
     *
     * <code>string DomainType = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDomainType() {
      
      domainType_ = getDefaultInstance().getDomainType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *域名类型
     *播放域名:play
     *封面域名:image
     * </pre>
     *
     * <code>string DomainType = 2;</code>
     * @param value The bytes for domainType to set.
     * @return This builder for chaining.
     */
    public Builder setDomainTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      domainType_ = value;
      onChanged();
      return this;
    }

    private int sourceStationType_ ;
    /**
     * <pre>
     *源站类型
     *回点播源站:1
     *第三方源站:2
     * </pre>
     *
     * <code>int32 SourceStationType = 3;</code>
     * @return The sourceStationType.
     */
    @java.lang.Override
    public int getSourceStationType() {
      return sourceStationType_;
    }
    /**
     * <pre>
     *源站类型
     *回点播源站:1
     *第三方源站:2
     * </pre>
     *
     * <code>int32 SourceStationType = 3;</code>
     * @param value The sourceStationType to set.
     * @return This builder for chaining.
     */
    public Builder setSourceStationType(int value) {
      
      sourceStationType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *源站类型
     *回点播源站:1
     *第三方源站:2
     * </pre>
     *
     * <code>int32 SourceStationType = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceStationType() {
      
      sourceStationType_ = 0;
      onChanged();
      return this;
    }

    private int offset_ ;
    /**
     * <pre>
     *跳过域名组的游标
     * </pre>
     *
     * <code>int32 Offset = 4;</code>
     * @return The offset.
     */
    @java.lang.Override
    public int getOffset() {
      return offset_;
    }
    /**
     * <pre>
     *跳过域名组的游标
     * </pre>
     *
     * <code>int32 Offset = 4;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(int value) {
      
      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *跳过域名组的游标
     * </pre>
     *
     * <code>int32 Offset = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      
      offset_ = 0;
      onChanged();
      return this;
    }

    private int limit_ ;
    /**
     * <pre>
     *单次查询域名组数量
     * </pre>
     *
     * <code>int32 Limit = 5;</code>
     * @return The limit.
     */
    @java.lang.Override
    public int getLimit() {
      return limit_;
    }
    /**
     * <pre>
     *单次查询域名组数量
     * </pre>
     *
     * <code>int32 Limit = 5;</code>
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(int value) {
      
      limit_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *单次查询域名组数量
     * </pre>
     *
     * <code>int32 Limit = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLimit() {
      
      limit_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Request.VodListDomainRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Request.VodListDomainRequest)
  private static final com.volcengine.service.vod.model.request.VodListDomainRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.request.VodListDomainRequest();
  }

  public static com.volcengine.service.vod.model.request.VodListDomainRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodListDomainRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodListDomainRequest>() {
    @java.lang.Override
    public VodListDomainRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodListDomainRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodListDomainRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodListDomainRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.request.VodListDomainRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

