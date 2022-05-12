// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodGetMediaListRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodGetMediaListRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *空间名
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <pre>
   *空间名
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <pre>
   *视频ID
   * </pre>
   *
   * <code>string Vid = 2;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <pre>
   *视频ID
   * </pre>
   *
   * <code>string Vid = 2;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <pre>
   *视频状态
   * </pre>
   *
   * <code>string Status = 3;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   *视频状态
   * </pre>
   *
   * <code>string Status = 3;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <pre>
   *排序规则
   * </pre>
   *
   * <code>string Order = 4;</code>
   * @return The order.
   */
  java.lang.String getOrder();
  /**
   * <pre>
   *排序规则
   * </pre>
   *
   * <code>string Order = 4;</code>
   * @return The bytes for order.
   */
  com.google.protobuf.ByteString
      getOrderBytes();

  /**
   * <pre>
   *标签，多个用","隔开
   * </pre>
   *
   * <code>string Tags = 5;</code>
   * @return The tags.
   */
  java.lang.String getTags();
  /**
   * <pre>
   *标签，多个用","隔开
   * </pre>
   *
   * <code>string Tags = 5;</code>
   * @return The bytes for tags.
   */
  com.google.protobuf.ByteString
      getTagsBytes();

  /**
   * <pre>
   *查询时间范围下限
   * </pre>
   *
   * <code>string StartTime = 6;</code>
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   * <pre>
   *查询时间范围下限
   * </pre>
   *
   * <code>string StartTime = 6;</code>
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString
      getStartTimeBytes();

  /**
   * <pre>
   *查询时间范围上限
   * </pre>
   *
   * <code>string EndTime = 7;</code>
   * @return The endTime.
   */
  java.lang.String getEndTime();
  /**
   * <pre>
   *查询时间范围上限
   * </pre>
   *
   * <code>string EndTime = 7;</code>
   * @return The bytes for endTime.
   */
  com.google.protobuf.ByteString
      getEndTimeBytes();

  /**
   * <pre>
   *数据偏移量
   * </pre>
   *
   * <code>string Offset = 8;</code>
   * @return The offset.
   */
  java.lang.String getOffset();
  /**
   * <pre>
   *数据偏移量
   * </pre>
   *
   * <code>string Offset = 8;</code>
   * @return The bytes for offset.
   */
  com.google.protobuf.ByteString
      getOffsetBytes();

  /**
   * <pre>
   *分页大小
   * </pre>
   *
   * <code>string PageSize = 9;</code>
   * @return The pageSize.
   */
  java.lang.String getPageSize();
  /**
   * <pre>
   *分页大小
   * </pre>
   *
   * <code>string PageSize = 9;</code>
   * @return The bytes for pageSize.
   */
  com.google.protobuf.ByteString
      getPageSizeBytes();

  /**
   * <pre>
   *分类id列表
   * </pre>
   *
   * <code>string ClassificationIds = 10;</code>
   * @return The classificationIds.
   */
  java.lang.String getClassificationIds();
  /**
   * <pre>
   *分类id列表
   * </pre>
   *
   * <code>string ClassificationIds = 10;</code>
   * @return The bytes for classificationIds.
   */
  com.google.protobuf.ByteString
      getClassificationIdsBytes();
}
