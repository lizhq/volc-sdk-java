// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

public interface VodListFileMetaInfosByFileNamesResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodListFileMetaInfosByFileNamesResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *码流基础信息
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodFileMetaInfo VodFileMetaInfos = 1;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodFileMetaInfo> 
      getVodFileMetaInfosList();
  /**
   * <pre>
   *码流基础信息
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodFileMetaInfo VodFileMetaInfos = 1;</code>
   */
  com.volcengine.service.vod.model.business.VodFileMetaInfo getVodFileMetaInfos(int index);
  /**
   * <pre>
   *码流基础信息
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodFileMetaInfo VodFileMetaInfos = 1;</code>
   */
  int getVodFileMetaInfosCount();
  /**
   * <pre>
   *码流基础信息
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodFileMetaInfo VodFileMetaInfos = 1;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodFileMetaInfoOrBuilder> 
      getVodFileMetaInfosOrBuilderList();
  /**
   * <pre>
   *码流基础信息
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodFileMetaInfo VodFileMetaInfos = 1;</code>
   */
  com.volcengine.service.vod.model.business.VodFileMetaInfoOrBuilder getVodFileMetaInfosOrBuilder(
      int index);
}