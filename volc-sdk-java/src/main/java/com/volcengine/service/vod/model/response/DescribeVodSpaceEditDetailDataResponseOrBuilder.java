// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/response/response_vod.proto

package com.volcengine.service.vod.model.response;

public interface DescribeVodSpaceEditDetailDataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Response.DescribeVodSpaceEditDetailDataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  boolean hasResponseMetadata();
  /**
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  com.volcengine.service.base.model.base.ResponseMetadata getResponseMetadata();
  /**
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  com.volcengine.service.base.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder();

  /**
   * <code>.Volcengine.Vod.Models.Business.DescribeVodSpaceEditDetailDataResult Result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>.Volcengine.Vod.Models.Business.DescribeVodSpaceEditDetailDataResult Result = 2;</code>
   * @return The result.
   */
  com.volcengine.service.vod.model.business.DescribeVodSpaceEditDetailDataResult getResult();
  /**
   * <code>.Volcengine.Vod.Models.Business.DescribeVodSpaceEditDetailDataResult Result = 2;</code>
   */
  com.volcengine.service.vod.model.business.DescribeVodSpaceEditDetailDataResultOrBuilder getResultOrBuilder();
}
