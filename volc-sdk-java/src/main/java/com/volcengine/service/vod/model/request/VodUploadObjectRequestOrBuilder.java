// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodUploadObjectRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodUploadObjectRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 上传的空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <pre>
   * 上传的空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <pre>
   * 上传文件的路径 
   * </pre>
   *
   * <code>string FilePath = 2;</code>
   * @return The filePath.
   */
  java.lang.String getFilePath();
  /**
   * <pre>
   * 上传文件的路径 
   * </pre>
   *
   * <code>string FilePath = 2;</code>
   * @return The bytes for filePath.
   */
  com.google.protobuf.ByteString
      getFilePathBytes();

  /**
   * <pre>
   * 业务希望上传透传的信息，会在上传成功时返回给用户 
   * </pre>
   *
   * <code>string CallbackArgs = 3;</code>
   * @return The callbackArgs.
   */
  java.lang.String getCallbackArgs();
  /**
   * <pre>
   * 业务希望上传透传的信息，会在上传成功时返回给用户 
   * </pre>
   *
   * <code>string CallbackArgs = 3;</code>
   * @return The bytes for callbackArgs.
   */
  com.google.protobuf.ByteString
      getCallbackArgsBytes();

  /**
   * <pre>
   * 上传的功能函数 
   * </pre>
   *
   * <code>string Functions = 4;</code>
   * @return The functions.
   */
  java.lang.String getFunctions();
  /**
   * <pre>
   * 上传的功能函数 
   * </pre>
   *
   * <code>string Functions = 4;</code>
   * @return The bytes for functions.
   */
  com.google.protobuf.ByteString
      getFunctionsBytes();

  /**
   * <pre>
   * 上传的文件在存储中的名字，即 bucket/key 中的 key 
   * </pre>
   *
   * <code>string FileName = 5;</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <pre>
   * 上传的文件在存储中的名字，即 bucket/key 中的 key 
   * </pre>
   *
   * <code>string FileName = 5;</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <pre>
   * 上传中文件的文件后缀 
   * </pre>
   *
   * <code>string FileExtension = 6;</code>
   * @return The fileExtension.
   */
  java.lang.String getFileExtension();
  /**
   * <pre>
   * 上传中文件的文件后缀 
   * </pre>
   *
   * <code>string FileExtension = 6;</code>
   * @return The bytes for fileExtension.
   */
  com.google.protobuf.ByteString
      getFileExtensionBytes();

  /**
   * <pre>
   * 上传策略 
   * </pre>
   *
   * <code>int32 UploadStrategy = 7;</code>
   * @return The uploadStrategy.
   */
  int getUploadStrategy();

  /**
   * <pre>
   * 分片并发数 
   * </pre>
   *
   * <code>int32 ParallelNum = 8;</code>
   * @return The parallelNum.
   */
  int getParallelNum();

  /**
   * <pre>
   * 客户端网络环境 
   * </pre>
   *
   * <code>string ClientNetWorkMode = 9;</code>
   * @return The clientNetWorkMode.
   */
  java.lang.String getClientNetWorkMode();
  /**
   * <pre>
   * 客户端网络环境 
   * </pre>
   *
   * <code>string ClientNetWorkMode = 9;</code>
   * @return The bytes for clientNetWorkMode.
   */
  com.google.protobuf.ByteString
      getClientNetWorkModeBytes();

  /**
   * <pre>
   * 客户端机房环境 
   * </pre>
   *
   * <code>string ClientIDCMode = 10;</code>
   * @return The clientIDCMode.
   */
  java.lang.String getClientIDCMode();
  /**
   * <pre>
   * 客户端机房环境 
   * </pre>
   *
   * <code>string ClientIDCMode = 10;</code>
   * @return The bytes for clientIDCMode.
   */
  com.google.protobuf.ByteString
      getClientIDCModeBytes();
}
