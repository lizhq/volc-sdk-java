// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

public interface VodBandwidthDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodBandwidthData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 每个时间粒度的时间
   * </pre>
   *
   * <code>string Time = 1;</code>
   * @return The time.
   */
  java.lang.String getTime();
  /**
   * <pre>
   * 每个时间粒度的时间
   * </pre>
   *
   * <code>string Time = 1;</code>
   * @return The bytes for time.
   */
  com.google.protobuf.ByteString
      getTimeBytes();

  /**
   * <pre>
   * 带宽，单位为 Mbps
   * </pre>
   *
   * <code>double Bandwidth = 2;</code>
   * @return The bandwidth.
   */
  double getBandwidth();
}
