// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodASRLanguageDetailForAudit}
 */
public final class VodASRLanguageDetailForAudit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodASRLanguageDetailForAudit)
    VodASRLanguageDetailForAuditOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodASRLanguageDetailForAudit.newBuilder() to construct.
  private VodASRLanguageDetailForAudit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodASRLanguageDetailForAudit() {
    language_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodASRLanguageDetailForAudit();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodASRLanguageDetailForAudit(
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
          case 9: {

            prob_ = input.readDouble();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            language_ = s;
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
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodASRLanguageDetailForAudit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodASRLanguageDetailForAudit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit.class, com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit.Builder.class);
  }

  public static final int PROB_FIELD_NUMBER = 1;
  private double prob_;
  /**
   * <pre>
   * 识别为此语言的概率
   * </pre>
   *
   * <code>double Prob = 1;</code>
   * @return The prob.
   */
  @java.lang.Override
  public double getProb() {
    return prob_;
  }

  public static final int LANGUAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object language_;
  /**
   * <pre>
   *语言类型，形式形如`&lt;mand&gt;`=普通话，`&lt;sc&gt;`=四川话，`&lt;cant&gt;`=粤语
   * </pre>
   *
   * <code>string Language = 2;</code>
   * @return The language.
   */
  @java.lang.Override
  public java.lang.String getLanguage() {
    java.lang.Object ref = language_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      language_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *语言类型，形式形如`&lt;mand&gt;`=普通话，`&lt;sc&gt;`=四川话，`&lt;cant&gt;`=粤语
   * </pre>
   *
   * <code>string Language = 2;</code>
   * @return The bytes for language.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLanguageBytes() {
    java.lang.Object ref = language_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      language_ = b;
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
    if (prob_ != 0D) {
      output.writeDouble(1, prob_);
    }
    if (!getLanguageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, language_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (prob_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, prob_);
    }
    if (!getLanguageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, language_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit other = (com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit) obj;

    if (java.lang.Double.doubleToLongBits(getProb())
        != java.lang.Double.doubleToLongBits(
            other.getProb())) return false;
    if (!getLanguage()
        .equals(other.getLanguage())) return false;
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
    hash = (37 * hash) + PROB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getProb()));
    hash = (37 * hash) + LANGUAGE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodASRLanguageDetailForAudit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodASRLanguageDetailForAudit)
      com.volcengine.service.vod.model.business.VodASRLanguageDetailForAuditOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodASRLanguageDetailForAudit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodASRLanguageDetailForAudit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit.class, com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit.newBuilder()
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
      prob_ = 0D;

      language_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodASRLanguageDetailForAudit_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit build() {
      com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit buildPartial() {
      com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit result = new com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit(this);
      result.prob_ = prob_;
      result.language_ = language_;
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
      if (other instanceof com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit other) {
      if (other == com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit.getDefaultInstance()) return this;
      if (other.getProb() != 0D) {
        setProb(other.getProb());
      }
      if (!other.getLanguage().isEmpty()) {
        language_ = other.language_;
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
      com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double prob_ ;
    /**
     * <pre>
     * 识别为此语言的概率
     * </pre>
     *
     * <code>double Prob = 1;</code>
     * @return The prob.
     */
    @java.lang.Override
    public double getProb() {
      return prob_;
    }
    /**
     * <pre>
     * 识别为此语言的概率
     * </pre>
     *
     * <code>double Prob = 1;</code>
     * @param value The prob to set.
     * @return This builder for chaining.
     */
    public Builder setProb(double value) {
      
      prob_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 识别为此语言的概率
     * </pre>
     *
     * <code>double Prob = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProb() {
      
      prob_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object language_ = "";
    /**
     * <pre>
     *语言类型，形式形如`&lt;mand&gt;`=普通话，`&lt;sc&gt;`=四川话，`&lt;cant&gt;`=粤语
     * </pre>
     *
     * <code>string Language = 2;</code>
     * @return The language.
     */
    public java.lang.String getLanguage() {
      java.lang.Object ref = language_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        language_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *语言类型，形式形如`&lt;mand&gt;`=普通话，`&lt;sc&gt;`=四川话，`&lt;cant&gt;`=粤语
     * </pre>
     *
     * <code>string Language = 2;</code>
     * @return The bytes for language.
     */
    public com.google.protobuf.ByteString
        getLanguageBytes() {
      java.lang.Object ref = language_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        language_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *语言类型，形式形如`&lt;mand&gt;`=普通话，`&lt;sc&gt;`=四川话，`&lt;cant&gt;`=粤语
     * </pre>
     *
     * <code>string Language = 2;</code>
     * @param value The language to set.
     * @return This builder for chaining.
     */
    public Builder setLanguage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      language_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *语言类型，形式形如`&lt;mand&gt;`=普通话，`&lt;sc&gt;`=四川话，`&lt;cant&gt;`=粤语
     * </pre>
     *
     * <code>string Language = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguage() {
      
      language_ = getDefaultInstance().getLanguage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *语言类型，形式形如`&lt;mand&gt;`=普通话，`&lt;sc&gt;`=四川话，`&lt;cant&gt;`=粤语
     * </pre>
     *
     * <code>string Language = 2;</code>
     * @param value The bytes for language to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      language_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodASRLanguageDetailForAudit)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodASRLanguageDetailForAudit)
  private static final com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit();
  }

  public static com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodASRLanguageDetailForAudit>
      PARSER = new com.google.protobuf.AbstractParser<VodASRLanguageDetailForAudit>() {
    @java.lang.Override
    public VodASRLanguageDetailForAudit parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodASRLanguageDetailForAudit(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodASRLanguageDetailForAudit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodASRLanguageDetailForAudit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

