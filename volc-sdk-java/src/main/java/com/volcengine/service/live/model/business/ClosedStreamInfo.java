// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/business/stream_manage.proto

package com.volcengine.service.live.model.business;

/**
 * Protobuf type {@code Volcengine.Live.Models.Business.ClosedStreamInfo}
 */
public final class ClosedStreamInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Live.Models.Business.ClosedStreamInfo)
    ClosedStreamInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClosedStreamInfo.newBuilder() to construct.
  private ClosedStreamInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClosedStreamInfo() {
    streamInfoList_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClosedStreamInfo();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClosedStreamInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              streamInfoList_ = new java.util.ArrayList<ClosedStream>();
              mutable_bitField0_ |= 0x00000001;
            }
            streamInfoList_.add(
                input.readMessage(ClosedStream.parser(), extensionRegistry));
            break;
          }
          case 16: {

            roughCount_ = input.readInt64();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        streamInfoList_ = java.util.Collections.unmodifiableList(streamInfoList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return StreamManage.internal_static_Volcengine_Live_Models_Business_ClosedStreamInfo_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return StreamManage.internal_static_Volcengine_Live_Models_Business_ClosedStreamInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ClosedStreamInfo.class, Builder.class);
  }

  public static final int STREAMINFOLIST_FIELD_NUMBER = 1;
  private java.util.List<ClosedStream> streamInfoList_;
  /**
   * <pre>
   * 历史流的信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
   */
  @Override
  public java.util.List<ClosedStream> getStreamInfoListList() {
    return streamInfoList_;
  }
  /**
   * <pre>
   * 历史流的信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
   */
  @Override
  public java.util.List<? extends ClosedStreamOrBuilder>
      getStreamInfoListOrBuilderList() {
    return streamInfoList_;
  }
  /**
   * <pre>
   * 历史流的信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
   */
  @Override
  public int getStreamInfoListCount() {
    return streamInfoList_.size();
  }
  /**
   * <pre>
   * 历史流的信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
   */
  @Override
  public ClosedStream getStreamInfoList(int index) {
    return streamInfoList_.get(index);
  }
  /**
   * <pre>
   * 历史流的信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
   */
  @Override
  public ClosedStreamOrBuilder getStreamInfoListOrBuilder(
      int index) {
    return streamInfoList_.get(index);
  }

  public static final int ROUGHCOUNT_FIELD_NUMBER = 2;
  private long roughCount_;
  /**
   * <pre>
   * 流数量
   * </pre>
   *
   * <code>int64 RoughCount = 2;</code>
   * @return The roughCount.
   */
  @Override
  public long getRoughCount() {
    return roughCount_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < streamInfoList_.size(); i++) {
      output.writeMessage(1, streamInfoList_.get(i));
    }
    if (roughCount_ != 0L) {
      output.writeInt64(2, roughCount_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < streamInfoList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, streamInfoList_.get(i));
    }
    if (roughCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, roughCount_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ClosedStreamInfo)) {
      return super.equals(obj);
    }
    ClosedStreamInfo other = (ClosedStreamInfo) obj;

    if (!getStreamInfoListList()
        .equals(other.getStreamInfoListList())) return false;
    if (getRoughCount()
        != other.getRoughCount()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getStreamInfoListCount() > 0) {
      hash = (37 * hash) + STREAMINFOLIST_FIELD_NUMBER;
      hash = (53 * hash) + getStreamInfoListList().hashCode();
    }
    hash = (37 * hash) + ROUGHCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRoughCount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ClosedStreamInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ClosedStreamInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ClosedStreamInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ClosedStreamInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ClosedStreamInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ClosedStreamInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ClosedStreamInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ClosedStreamInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ClosedStreamInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ClosedStreamInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ClosedStreamInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ClosedStreamInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ClosedStreamInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Volcengine.Live.Models.Business.ClosedStreamInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Live.Models.Business.ClosedStreamInfo)
      ClosedStreamInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return StreamManage.internal_static_Volcengine_Live_Models_Business_ClosedStreamInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return StreamManage.internal_static_Volcengine_Live_Models_Business_ClosedStreamInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ClosedStreamInfo.class, Builder.class);
    }

    // Construct using com.volcengine.service.live.model.business.ClosedStreamInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getStreamInfoListFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (streamInfoListBuilder_ == null) {
        streamInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        streamInfoListBuilder_.clear();
      }
      roughCount_ = 0L;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return StreamManage.internal_static_Volcengine_Live_Models_Business_ClosedStreamInfo_descriptor;
    }

    @Override
    public ClosedStreamInfo getDefaultInstanceForType() {
      return ClosedStreamInfo.getDefaultInstance();
    }

    @Override
    public ClosedStreamInfo build() {
      ClosedStreamInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ClosedStreamInfo buildPartial() {
      ClosedStreamInfo result = new ClosedStreamInfo(this);
      int from_bitField0_ = bitField0_;
      if (streamInfoListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          streamInfoList_ = java.util.Collections.unmodifiableList(streamInfoList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.streamInfoList_ = streamInfoList_;
      } else {
        result.streamInfoList_ = streamInfoListBuilder_.build();
      }
      result.roughCount_ = roughCount_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ClosedStreamInfo) {
        return mergeFrom((ClosedStreamInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ClosedStreamInfo other) {
      if (other == ClosedStreamInfo.getDefaultInstance()) return this;
      if (streamInfoListBuilder_ == null) {
        if (!other.streamInfoList_.isEmpty()) {
          if (streamInfoList_.isEmpty()) {
            streamInfoList_ = other.streamInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStreamInfoListIsMutable();
            streamInfoList_.addAll(other.streamInfoList_);
          }
          onChanged();
        }
      } else {
        if (!other.streamInfoList_.isEmpty()) {
          if (streamInfoListBuilder_.isEmpty()) {
            streamInfoListBuilder_.dispose();
            streamInfoListBuilder_ = null;
            streamInfoList_ = other.streamInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            streamInfoListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStreamInfoListFieldBuilder() : null;
          } else {
            streamInfoListBuilder_.addAllMessages(other.streamInfoList_);
          }
        }
      }
      if (other.getRoughCount() != 0L) {
        setRoughCount(other.getRoughCount());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ClosedStreamInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ClosedStreamInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<ClosedStream> streamInfoList_ =
      java.util.Collections.emptyList();
    private void ensureStreamInfoListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        streamInfoList_ = new java.util.ArrayList<ClosedStream>(streamInfoList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ClosedStream, ClosedStream.Builder, ClosedStreamOrBuilder> streamInfoListBuilder_;

    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public java.util.List<ClosedStream> getStreamInfoListList() {
      if (streamInfoListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(streamInfoList_);
      } else {
        return streamInfoListBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public int getStreamInfoListCount() {
      if (streamInfoListBuilder_ == null) {
        return streamInfoList_.size();
      } else {
        return streamInfoListBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public ClosedStream getStreamInfoList(int index) {
      if (streamInfoListBuilder_ == null) {
        return streamInfoList_.get(index);
      } else {
        return streamInfoListBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public Builder setStreamInfoList(
        int index, ClosedStream value) {
      if (streamInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStreamInfoListIsMutable();
        streamInfoList_.set(index, value);
        onChanged();
      } else {
        streamInfoListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public Builder setStreamInfoList(
        int index, ClosedStream.Builder builderForValue) {
      if (streamInfoListBuilder_ == null) {
        ensureStreamInfoListIsMutable();
        streamInfoList_.set(index, builderForValue.build());
        onChanged();
      } else {
        streamInfoListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public Builder addStreamInfoList(ClosedStream value) {
      if (streamInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStreamInfoListIsMutable();
        streamInfoList_.add(value);
        onChanged();
      } else {
        streamInfoListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public Builder addStreamInfoList(
        int index, ClosedStream value) {
      if (streamInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStreamInfoListIsMutable();
        streamInfoList_.add(index, value);
        onChanged();
      } else {
        streamInfoListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public Builder addStreamInfoList(
        ClosedStream.Builder builderForValue) {
      if (streamInfoListBuilder_ == null) {
        ensureStreamInfoListIsMutable();
        streamInfoList_.add(builderForValue.build());
        onChanged();
      } else {
        streamInfoListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public Builder addStreamInfoList(
        int index, ClosedStream.Builder builderForValue) {
      if (streamInfoListBuilder_ == null) {
        ensureStreamInfoListIsMutable();
        streamInfoList_.add(index, builderForValue.build());
        onChanged();
      } else {
        streamInfoListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public Builder addAllStreamInfoList(
        Iterable<? extends ClosedStream> values) {
      if (streamInfoListBuilder_ == null) {
        ensureStreamInfoListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, streamInfoList_);
        onChanged();
      } else {
        streamInfoListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public Builder clearStreamInfoList() {
      if (streamInfoListBuilder_ == null) {
        streamInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        streamInfoListBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public Builder removeStreamInfoList(int index) {
      if (streamInfoListBuilder_ == null) {
        ensureStreamInfoListIsMutable();
        streamInfoList_.remove(index);
        onChanged();
      } else {
        streamInfoListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public ClosedStream.Builder getStreamInfoListBuilder(
        int index) {
      return getStreamInfoListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public ClosedStreamOrBuilder getStreamInfoListOrBuilder(
        int index) {
      if (streamInfoListBuilder_ == null) {
        return streamInfoList_.get(index);  } else {
        return streamInfoListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public java.util.List<? extends ClosedStreamOrBuilder>
         getStreamInfoListOrBuilderList() {
      if (streamInfoListBuilder_ != null) {
        return streamInfoListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(streamInfoList_);
      }
    }
    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public ClosedStream.Builder addStreamInfoListBuilder() {
      return getStreamInfoListFieldBuilder().addBuilder(
          ClosedStream.getDefaultInstance());
    }
    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public ClosedStream.Builder addStreamInfoListBuilder(
        int index) {
      return getStreamInfoListFieldBuilder().addBuilder(
          index, ClosedStream.getDefaultInstance());
    }
    /**
     * <pre>
     * 历史流的信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Live.Models.Business.ClosedStream StreamInfoList = 1;</code>
     */
    public java.util.List<ClosedStream.Builder>
         getStreamInfoListBuilderList() {
      return getStreamInfoListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ClosedStream, ClosedStream.Builder, ClosedStreamOrBuilder>
        getStreamInfoListFieldBuilder() {
      if (streamInfoListBuilder_ == null) {
        streamInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ClosedStream, ClosedStream.Builder, ClosedStreamOrBuilder>(
                streamInfoList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        streamInfoList_ = null;
      }
      return streamInfoListBuilder_;
    }

    private long roughCount_ ;
    /**
     * <pre>
     * 流数量
     * </pre>
     *
     * <code>int64 RoughCount = 2;</code>
     * @return The roughCount.
     */
    @Override
    public long getRoughCount() {
      return roughCount_;
    }
    /**
     * <pre>
     * 流数量
     * </pre>
     *
     * <code>int64 RoughCount = 2;</code>
     * @param value The roughCount to set.
     * @return This builder for chaining.
     */
    public Builder setRoughCount(long value) {
      
      roughCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 流数量
     * </pre>
     *
     * <code>int64 RoughCount = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoughCount() {
      
      roughCount_ = 0L;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Volcengine.Live.Models.Business.ClosedStreamInfo)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Live.Models.Business.ClosedStreamInfo)
  private static final ClosedStreamInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ClosedStreamInfo();
  }

  public static ClosedStreamInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClosedStreamInfo>
      PARSER = new com.google.protobuf.AbstractParser<ClosedStreamInfo>() {
    @Override
    public ClosedStreamInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClosedStreamInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClosedStreamInfo> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ClosedStreamInfo> getParserForType() {
    return PARSER;
  }

  @Override
  public ClosedStreamInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
