// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

/**
 * <pre>
 * **********************************************************************
 * 转码
 * **********************************************************************
 * </pre>
 *
 * Protobuf type {@code Volcengine.Vod.Models.Request.VodStartWorkflowRequest}
 */
public final class VodStartWorkflowRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Request.VodStartWorkflowRequest)
    VodStartWorkflowRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodStartWorkflowRequest.newBuilder() to construct.
  private VodStartWorkflowRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodStartWorkflowRequest() {
    vid_ = "";
    templateId_ = "";
    callbackArgs_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodStartWorkflowRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodStartWorkflowRequest(
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

            vid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            templateId_ = s;
            break;
          }
          case 26: {
            com.volcengine.service.vod.model.business.WorkflowParams.Builder subBuilder = null;
            if (input_ != null) {
              subBuilder = input_.toBuilder();
            }
            input_ = input.readMessage(com.volcengine.service.vod.model.business.WorkflowParams.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(input_);
              input_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            priority_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            callbackArgs_ = s;
            break;
          }
          case 48: {

            enableLowPriority_ = input.readBool();
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
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodStartWorkflowRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodStartWorkflowRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.request.VodStartWorkflowRequest.class, com.volcengine.service.vod.model.request.VodStartWorkflowRequest.Builder.class);
  }

  public static final int VID_FIELD_NUMBER = 1;
  private volatile java.lang.Object vid_;
  /**
   * <pre>
   * 视频Id
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  @java.lang.Override
  public java.lang.String getVid() {
    java.lang.Object ref = vid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 视频Id
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVidBytes() {
    java.lang.Object ref = vid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEMPLATEID_FIELD_NUMBER = 2;
  private volatile java.lang.Object templateId_;
  /**
   * <pre>
   * 工作流模板Id
   * </pre>
   *
   * <code>string TemplateId = 2;</code>
   * @return The templateId.
   */
  @java.lang.Override
  public java.lang.String getTemplateId() {
    java.lang.Object ref = templateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      templateId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 工作流模板Id
   * </pre>
   *
   * <code>string TemplateId = 2;</code>
   * @return The bytes for templateId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTemplateIdBytes() {
    java.lang.Object ref = templateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      templateId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INPUT_FIELD_NUMBER = 3;
  private com.volcengine.service.vod.model.business.WorkflowParams input_;
  /**
   * <pre>
   * 动态参数
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.WorkflowParams Input = 3;</code>
   * @return Whether the input field is set.
   */
  @java.lang.Override
  public boolean hasInput() {
    return input_ != null;
  }
  /**
   * <pre>
   * 动态参数
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.WorkflowParams Input = 3;</code>
   * @return The input.
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.WorkflowParams getInput() {
    return input_ == null ? com.volcengine.service.vod.model.business.WorkflowParams.getDefaultInstance() : input_;
  }
  /**
   * <pre>
   * 动态参数
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.WorkflowParams Input = 3;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.WorkflowParamsOrBuilder getInputOrBuilder() {
    return getInput();
  }

  public static final int PRIORITY_FIELD_NUMBER = 4;
  private int priority_;
  /**
   * <pre>
   * 任务优先级
   * </pre>
   *
   * <code>int32 Priority = 4;</code>
   * @return The priority.
   */
  @java.lang.Override
  public int getPriority() {
    return priority_;
  }

  public static final int CALLBACKARGS_FIELD_NUMBER = 5;
  private volatile java.lang.Object callbackArgs_;
  /**
   * <pre>
   * 回调参数
   * </pre>
   *
   * <code>string CallbackArgs = 5;</code>
   * @return The callbackArgs.
   */
  @java.lang.Override
  public java.lang.String getCallbackArgs() {
    java.lang.Object ref = callbackArgs_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      callbackArgs_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 回调参数
   * </pre>
   *
   * <code>string CallbackArgs = 5;</code>
   * @return The bytes for callbackArgs.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCallbackArgsBytes() {
    java.lang.Object ref = callbackArgs_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      callbackArgs_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENABLELOWPRIORITY_FIELD_NUMBER = 6;
  private boolean enableLowPriority_;
  /**
   * <pre>
   * 是否使能闲时转码
   * </pre>
   *
   * <code>bool EnableLowPriority = 6;</code>
   * @return The enableLowPriority.
   */
  @java.lang.Override
  public boolean getEnableLowPriority() {
    return enableLowPriority_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(templateId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, templateId_);
    }
    if (input_ != null) {
      output.writeMessage(3, getInput());
    }
    if (priority_ != 0) {
      output.writeInt32(4, priority_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(callbackArgs_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, callbackArgs_);
    }
    if (enableLowPriority_ != false) {
      output.writeBool(6, enableLowPriority_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(templateId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, templateId_);
    }
    if (input_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getInput());
    }
    if (priority_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, priority_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(callbackArgs_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, callbackArgs_);
    }
    if (enableLowPriority_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, enableLowPriority_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.request.VodStartWorkflowRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.request.VodStartWorkflowRequest other = (com.volcengine.service.vod.model.request.VodStartWorkflowRequest) obj;

    if (!getVid()
        .equals(other.getVid())) return false;
    if (!getTemplateId()
        .equals(other.getTemplateId())) return false;
    if (hasInput() != other.hasInput()) return false;
    if (hasInput()) {
      if (!getInput()
          .equals(other.getInput())) return false;
    }
    if (getPriority()
        != other.getPriority()) return false;
    if (!getCallbackArgs()
        .equals(other.getCallbackArgs())) return false;
    if (getEnableLowPriority()
        != other.getEnableLowPriority()) return false;
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
    hash = (37 * hash) + VID_FIELD_NUMBER;
    hash = (53 * hash) + getVid().hashCode();
    hash = (37 * hash) + TEMPLATEID_FIELD_NUMBER;
    hash = (53 * hash) + getTemplateId().hashCode();
    if (hasInput()) {
      hash = (37 * hash) + INPUT_FIELD_NUMBER;
      hash = (53 * hash) + getInput().hashCode();
    }
    hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + getPriority();
    hash = (37 * hash) + CALLBACKARGS_FIELD_NUMBER;
    hash = (53 * hash) + getCallbackArgs().hashCode();
    hash = (37 * hash) + ENABLELOWPRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableLowPriority());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.request.VodStartWorkflowRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodStartWorkflowRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodStartWorkflowRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodStartWorkflowRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodStartWorkflowRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodStartWorkflowRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodStartWorkflowRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodStartWorkflowRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodStartWorkflowRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodStartWorkflowRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodStartWorkflowRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodStartWorkflowRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.request.VodStartWorkflowRequest prototype) {
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
   * <pre>
   * **********************************************************************
   * 转码
   * **********************************************************************
   * </pre>
   *
   * Protobuf type {@code Volcengine.Vod.Models.Request.VodStartWorkflowRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Request.VodStartWorkflowRequest)
      com.volcengine.service.vod.model.request.VodStartWorkflowRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodStartWorkflowRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodStartWorkflowRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.request.VodStartWorkflowRequest.class, com.volcengine.service.vod.model.request.VodStartWorkflowRequest.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.request.VodStartWorkflowRequest.newBuilder()
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
      vid_ = "";

      templateId_ = "";

      if (inputBuilder_ == null) {
        input_ = null;
      } else {
        input_ = null;
        inputBuilder_ = null;
      }
      priority_ = 0;

      callbackArgs_ = "";

      enableLowPriority_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodStartWorkflowRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodStartWorkflowRequest getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.request.VodStartWorkflowRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodStartWorkflowRequest build() {
      com.volcengine.service.vod.model.request.VodStartWorkflowRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodStartWorkflowRequest buildPartial() {
      com.volcengine.service.vod.model.request.VodStartWorkflowRequest result = new com.volcengine.service.vod.model.request.VodStartWorkflowRequest(this);
      result.vid_ = vid_;
      result.templateId_ = templateId_;
      if (inputBuilder_ == null) {
        result.input_ = input_;
      } else {
        result.input_ = inputBuilder_.build();
      }
      result.priority_ = priority_;
      result.callbackArgs_ = callbackArgs_;
      result.enableLowPriority_ = enableLowPriority_;
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
      if (other instanceof com.volcengine.service.vod.model.request.VodStartWorkflowRequest) {
        return mergeFrom((com.volcengine.service.vod.model.request.VodStartWorkflowRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.request.VodStartWorkflowRequest other) {
      if (other == com.volcengine.service.vod.model.request.VodStartWorkflowRequest.getDefaultInstance()) return this;
      if (!other.getVid().isEmpty()) {
        vid_ = other.vid_;
        onChanged();
      }
      if (!other.getTemplateId().isEmpty()) {
        templateId_ = other.templateId_;
        onChanged();
      }
      if (other.hasInput()) {
        mergeInput(other.getInput());
      }
      if (other.getPriority() != 0) {
        setPriority(other.getPriority());
      }
      if (!other.getCallbackArgs().isEmpty()) {
        callbackArgs_ = other.callbackArgs_;
        onChanged();
      }
      if (other.getEnableLowPriority() != false) {
        setEnableLowPriority(other.getEnableLowPriority());
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
      com.volcengine.service.vod.model.request.VodStartWorkflowRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.request.VodStartWorkflowRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object vid_ = "";
    /**
     * <pre>
     * 视频Id
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @return The vid.
     */
    public java.lang.String getVid() {
      java.lang.Object ref = vid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 视频Id
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @return The bytes for vid.
     */
    public com.google.protobuf.ByteString
        getVidBytes() {
      java.lang.Object ref = vid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 视频Id
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @param value The vid to set.
     * @return This builder for chaining.
     */
    public Builder setVid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 视频Id
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVid() {
      
      vid_ = getDefaultInstance().getVid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 视频Id
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @param value The bytes for vid to set.
     * @return This builder for chaining.
     */
    public Builder setVidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object templateId_ = "";
    /**
     * <pre>
     * 工作流模板Id
     * </pre>
     *
     * <code>string TemplateId = 2;</code>
     * @return The templateId.
     */
    public java.lang.String getTemplateId() {
      java.lang.Object ref = templateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        templateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 工作流模板Id
     * </pre>
     *
     * <code>string TemplateId = 2;</code>
     * @return The bytes for templateId.
     */
    public com.google.protobuf.ByteString
        getTemplateIdBytes() {
      java.lang.Object ref = templateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        templateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 工作流模板Id
     * </pre>
     *
     * <code>string TemplateId = 2;</code>
     * @param value The templateId to set.
     * @return This builder for chaining.
     */
    public Builder setTemplateId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      templateId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 工作流模板Id
     * </pre>
     *
     * <code>string TemplateId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTemplateId() {
      
      templateId_ = getDefaultInstance().getTemplateId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 工作流模板Id
     * </pre>
     *
     * <code>string TemplateId = 2;</code>
     * @param value The bytes for templateId to set.
     * @return This builder for chaining.
     */
    public Builder setTemplateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      templateId_ = value;
      onChanged();
      return this;
    }

    private com.volcengine.service.vod.model.business.WorkflowParams input_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.WorkflowParams, com.volcengine.service.vod.model.business.WorkflowParams.Builder, com.volcengine.service.vod.model.business.WorkflowParamsOrBuilder> inputBuilder_;
    /**
     * <pre>
     * 动态参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.WorkflowParams Input = 3;</code>
     * @return Whether the input field is set.
     */
    public boolean hasInput() {
      return inputBuilder_ != null || input_ != null;
    }
    /**
     * <pre>
     * 动态参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.WorkflowParams Input = 3;</code>
     * @return The input.
     */
    public com.volcengine.service.vod.model.business.WorkflowParams getInput() {
      if (inputBuilder_ == null) {
        return input_ == null ? com.volcengine.service.vod.model.business.WorkflowParams.getDefaultInstance() : input_;
      } else {
        return inputBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 动态参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.WorkflowParams Input = 3;</code>
     */
    public Builder setInput(com.volcengine.service.vod.model.business.WorkflowParams value) {
      if (inputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        input_ = value;
        onChanged();
      } else {
        inputBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 动态参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.WorkflowParams Input = 3;</code>
     */
    public Builder setInput(
        com.volcengine.service.vod.model.business.WorkflowParams.Builder builderForValue) {
      if (inputBuilder_ == null) {
        input_ = builderForValue.build();
        onChanged();
      } else {
        inputBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 动态参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.WorkflowParams Input = 3;</code>
     */
    public Builder mergeInput(com.volcengine.service.vod.model.business.WorkflowParams value) {
      if (inputBuilder_ == null) {
        if (input_ != null) {
          input_ =
            com.volcengine.service.vod.model.business.WorkflowParams.newBuilder(input_).mergeFrom(value).buildPartial();
        } else {
          input_ = value;
        }
        onChanged();
      } else {
        inputBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 动态参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.WorkflowParams Input = 3;</code>
     */
    public Builder clearInput() {
      if (inputBuilder_ == null) {
        input_ = null;
        onChanged();
      } else {
        input_ = null;
        inputBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 动态参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.WorkflowParams Input = 3;</code>
     */
    public com.volcengine.service.vod.model.business.WorkflowParams.Builder getInputBuilder() {
      
      onChanged();
      return getInputFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 动态参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.WorkflowParams Input = 3;</code>
     */
    public com.volcengine.service.vod.model.business.WorkflowParamsOrBuilder getInputOrBuilder() {
      if (inputBuilder_ != null) {
        return inputBuilder_.getMessageOrBuilder();
      } else {
        return input_ == null ?
            com.volcengine.service.vod.model.business.WorkflowParams.getDefaultInstance() : input_;
      }
    }
    /**
     * <pre>
     * 动态参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.WorkflowParams Input = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.WorkflowParams, com.volcengine.service.vod.model.business.WorkflowParams.Builder, com.volcengine.service.vod.model.business.WorkflowParamsOrBuilder> 
        getInputFieldBuilder() {
      if (inputBuilder_ == null) {
        inputBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.vod.model.business.WorkflowParams, com.volcengine.service.vod.model.business.WorkflowParams.Builder, com.volcengine.service.vod.model.business.WorkflowParamsOrBuilder>(
                getInput(),
                getParentForChildren(),
                isClean());
        input_ = null;
      }
      return inputBuilder_;
    }

    private int priority_ ;
    /**
     * <pre>
     * 任务优先级
     * </pre>
     *
     * <code>int32 Priority = 4;</code>
     * @return The priority.
     */
    @java.lang.Override
    public int getPriority() {
      return priority_;
    }
    /**
     * <pre>
     * 任务优先级
     * </pre>
     *
     * <code>int32 Priority = 4;</code>
     * @param value The priority to set.
     * @return This builder for chaining.
     */
    public Builder setPriority(int value) {
      
      priority_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 任务优先级
     * </pre>
     *
     * <code>int32 Priority = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPriority() {
      
      priority_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object callbackArgs_ = "";
    /**
     * <pre>
     * 回调参数
     * </pre>
     *
     * <code>string CallbackArgs = 5;</code>
     * @return The callbackArgs.
     */
    public java.lang.String getCallbackArgs() {
      java.lang.Object ref = callbackArgs_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        callbackArgs_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 回调参数
     * </pre>
     *
     * <code>string CallbackArgs = 5;</code>
     * @return The bytes for callbackArgs.
     */
    public com.google.protobuf.ByteString
        getCallbackArgsBytes() {
      java.lang.Object ref = callbackArgs_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        callbackArgs_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 回调参数
     * </pre>
     *
     * <code>string CallbackArgs = 5;</code>
     * @param value The callbackArgs to set.
     * @return This builder for chaining.
     */
    public Builder setCallbackArgs(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      callbackArgs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 回调参数
     * </pre>
     *
     * <code>string CallbackArgs = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCallbackArgs() {
      
      callbackArgs_ = getDefaultInstance().getCallbackArgs();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 回调参数
     * </pre>
     *
     * <code>string CallbackArgs = 5;</code>
     * @param value The bytes for callbackArgs to set.
     * @return This builder for chaining.
     */
    public Builder setCallbackArgsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      callbackArgs_ = value;
      onChanged();
      return this;
    }

    private boolean enableLowPriority_ ;
    /**
     * <pre>
     * 是否使能闲时转码
     * </pre>
     *
     * <code>bool EnableLowPriority = 6;</code>
     * @return The enableLowPriority.
     */
    @java.lang.Override
    public boolean getEnableLowPriority() {
      return enableLowPriority_;
    }
    /**
     * <pre>
     * 是否使能闲时转码
     * </pre>
     *
     * <code>bool EnableLowPriority = 6;</code>
     * @param value The enableLowPriority to set.
     * @return This builder for chaining.
     */
    public Builder setEnableLowPriority(boolean value) {
      
      enableLowPriority_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否使能闲时转码
     * </pre>
     *
     * <code>bool EnableLowPriority = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableLowPriority() {
      
      enableLowPriority_ = false;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Request.VodStartWorkflowRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Request.VodStartWorkflowRequest)
  private static final com.volcengine.service.vod.model.request.VodStartWorkflowRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.request.VodStartWorkflowRequest();
  }

  public static com.volcengine.service.vod.model.request.VodStartWorkflowRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodStartWorkflowRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodStartWorkflowRequest>() {
    @java.lang.Override
    public VodStartWorkflowRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodStartWorkflowRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodStartWorkflowRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodStartWorkflowRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.request.VodStartWorkflowRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

