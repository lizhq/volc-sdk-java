// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

/**
 * <pre>
 * 模型帧 抽帧选项
 * </pre>
 *
 * Protobuf enum {@code Volcengine.Vod.Models.Business.VodFrameExtractingOptionForAudit}
 */
public enum VodFrameExtractingOptionForAudit
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未定义的
   * </pre>
   *
   * <code>UndefinedVodFrameExtractingOptionForAudit = 0;</code>
   */
  UndefinedVodFrameExtractingOptionForAudit(0),
  /**
   * <pre>
   * 根据帧率取帧
   * </pre>
   *
   * <code>FpsVodFrameExtractingOptionForAudit = 1;</code>
   */
  FpsVodFrameExtractingOptionForAudit(1),
  /**
   * <pre>
   * 根据帧数取帧
   * </pre>
   *
   * <code>NumberOfFramesVodFrameExtractingOptionForAudit = 2;</code>
   */
  NumberOfFramesVodFrameExtractingOptionForAudit(2),
  /**
   * <pre>
   * 根据时间戳取帧
   * </pre>
   *
   * <code>CutTimesVodFrameExtractingOptionForAudit = 3;</code>
   */
  CutTimesVodFrameExtractingOptionForAudit(3),
  /**
   * <pre>
   * 根据Fps抽帧，并限制最大或最小帧数
   * </pre>
   *
   * <code>FpsLimitNumberOfFramesVodFrameExtractingOptionForAudit = 4;</code>
   */
  FpsLimitNumberOfFramesVodFrameExtractingOptionForAudit(4),
  /**
   * <pre>
   * 只取首帧或尾帧
   * </pre>
   *
   * <code>OnlyFirstLastFrameVodFrameExtractingOptionForAudit = 5;</code>
   */
  OnlyFirstLastFrameVodFrameExtractingOptionForAudit(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未定义的
   * </pre>
   *
   * <code>UndefinedVodFrameExtractingOptionForAudit = 0;</code>
   */
  public static final int UndefinedVodFrameExtractingOptionForAudit_VALUE = 0;
  /**
   * <pre>
   * 根据帧率取帧
   * </pre>
   *
   * <code>FpsVodFrameExtractingOptionForAudit = 1;</code>
   */
  public static final int FpsVodFrameExtractingOptionForAudit_VALUE = 1;
  /**
   * <pre>
   * 根据帧数取帧
   * </pre>
   *
   * <code>NumberOfFramesVodFrameExtractingOptionForAudit = 2;</code>
   */
  public static final int NumberOfFramesVodFrameExtractingOptionForAudit_VALUE = 2;
  /**
   * <pre>
   * 根据时间戳取帧
   * </pre>
   *
   * <code>CutTimesVodFrameExtractingOptionForAudit = 3;</code>
   */
  public static final int CutTimesVodFrameExtractingOptionForAudit_VALUE = 3;
  /**
   * <pre>
   * 根据Fps抽帧，并限制最大或最小帧数
   * </pre>
   *
   * <code>FpsLimitNumberOfFramesVodFrameExtractingOptionForAudit = 4;</code>
   */
  public static final int FpsLimitNumberOfFramesVodFrameExtractingOptionForAudit_VALUE = 4;
  /**
   * <pre>
   * 只取首帧或尾帧
   * </pre>
   *
   * <code>OnlyFirstLastFrameVodFrameExtractingOptionForAudit = 5;</code>
   */
  public static final int OnlyFirstLastFrameVodFrameExtractingOptionForAudit_VALUE = 5;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static VodFrameExtractingOptionForAudit valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VodFrameExtractingOptionForAudit forNumber(int value) {
    switch (value) {
      case 0: return UndefinedVodFrameExtractingOptionForAudit;
      case 1: return FpsVodFrameExtractingOptionForAudit;
      case 2: return NumberOfFramesVodFrameExtractingOptionForAudit;
      case 3: return CutTimesVodFrameExtractingOptionForAudit;
      case 4: return FpsLimitNumberOfFramesVodFrameExtractingOptionForAudit;
      case 5: return OnlyFirstLastFrameVodFrameExtractingOptionForAudit;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VodFrameExtractingOptionForAudit>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VodFrameExtractingOptionForAudit> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VodFrameExtractingOptionForAudit>() {
          public VodFrameExtractingOptionForAudit findValueByNumber(int number) {
            return VodFrameExtractingOptionForAudit.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodMedia.getDescriptor().getEnumTypes().get(0);
  }

  private static final VodFrameExtractingOptionForAudit[] VALUES = values();

  public static VodFrameExtractingOptionForAudit valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private VodFrameExtractingOptionForAudit(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Volcengine.Vod.Models.Business.VodFrameExtractingOptionForAudit)
}

