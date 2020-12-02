// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/response/response_vod.proto

package com.volcengine.model.vod.response;

public final class VodResponse {
  private VodResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Response_VodGetPlayInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Response_VodGetPlayInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Response_VodGetOriginalPlayInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Response_VodGetOriginalPlayInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Response_VodUploadMediaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Response_VodUploadMediaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Response_VodQueryUploadTaskInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Response_VodQueryUploadTaskInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Response_VodUrlUploadResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Response_VodUrlUploadResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Response_VodApplyUploadInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Response_VodApplyUploadInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Response_VodCommitUploadInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Response_VodCommitUploadInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Response_VodGetMediaInfosResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Response_VodGetMediaInfosResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Response_VodUpdateMediaInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Response_VodUpdateMediaInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Response_VodGetRecommendedPosterResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Response_VodGetRecommendedPosterResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Response_VodUpdateMediaPublishStatusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Response_VodUpdateMediaPublishStatusResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Response_VodStartWorkflowResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Response_VodStartWorkflowResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037vod/response/response_vod.proto\022\036Volce" +
      "ngine.Models.Vod.Response\032\017base/base.pro" +
      "to\032\033vod/business/vod_play.proto\032\034vod/bus" +
      "iness/vod_media.proto\032\035vod/business/vod_" +
      "upload.proto\032\037vod/business/vod_workflow." +
      "proto\"\236\001\n\026VodGetPlayInfoResponse\022B\n\020Resp" +
      "onseMetadata\030\001 \001(\0132(.Volcengine.Models.B" +
      "ase.ResponseMetadata\022@\n\006Result\030\002 \001(\01320.V" +
      "olcengine.Models.Vod.Business.VodPlayInf" +
      "oModel\"\262\001\n\036VodGetOriginalPlayInfoRespons" +
      "e\022B\n\020ResponseMetadata\030\001 \001(\0132(.Volcengine" +
      ".Models.Base.ResponseMetadata\022L\n\006Result\030" +
      "\002 \001(\0132<.Volcengine.Models.Vod.Business.V" +
      "odGetOriginalPlayInfoResult\"\233\001\n\026VodUploa" +
      "dMediaResponse\022B\n\020ResponseMetadata\030\001 \001(\013" +
      "2(.Volcengine.Models.Base.ResponseMetada" +
      "ta\022=\n\006Result\030\002 \001(\0132-.Volcengine.Models.V" +
      "od.Business.VodCommitData\"\242\001\n\036VodQueryUp" +
      "loadTaskInfoResponse\022B\n\020ResponseMetadata" +
      "\030\001 \001(\0132(.Volcengine.Models.Base.Response" +
      "Metadata\022<\n\006Result\030\002 \001(\0132,.Volcengine.Mo" +
      "dels.Vod.Business.VodQueryData\"\236\001\n\024VodUr" +
      "lUploadResponse\022B\n\020ResponseMetadata\030\001 \001(" +
      "\0132(.Volcengine.Models.Base.ResponseMetad" +
      "ata\022B\n\006Result\030\002 \001(\01322.Volcengine.Models." +
      "Vod.Business.VodUrlResponseData\"\252\001\n\032VodA" +
      "pplyUploadInfoResponse\022B\n\020ResponseMetada" +
      "ta\030\001 \001(\0132(.Volcengine.Models.Base.Respon" +
      "seMetadata\022H\n\006Result\030\002 \001(\01328.Volcengine." +
      "Models.Vod.Business.VodApplyUploadInfoRe" +
      "sult\"\254\001\n\033VodCommitUploadInfoResponse\022B\n\020" +
      "ResponseMetadata\030\001 \001(\0132(.Volcengine.Mode" +
      "ls.Base.ResponseMetadata\022I\n\006Result\030\002 \001(\013" +
      "29.Volcengine.Models.Vod.Business.VodCom" +
      "mitUploadInfoResult\"\244\001\n\030VodGetMediaInfos" +
      "Response\022B\n\020ResponseMetadata\030\001 \001(\0132(.Vol" +
      "cengine.Models.Base.ResponseMetadata\022D\n\006" +
      "Result\030\002 \001(\01324.Volcengine.Models.Vod.Bus" +
      "iness.VodGetMediaInfosData\"`\n\032VodUpdateM" +
      "ediaInfoResponse\022B\n\020ResponseMetadata\030\001 \001" +
      "(\0132(.Volcengine.Models.Base.ResponseMeta" +
      "data\"\252\001\n\037VodGetRecommendedPosterResponse" +
      "\022B\n\020ResponseMetadata\030\001 \001(\0132(.Volcengine." +
      "Models.Base.ResponseMetadata\022C\n\006Result\030\002" +
      " \001(\01323.Volcengine.Models.Vod.Business.Vo" +
      "dGetRecPosterData\"i\n#VodUpdateMediaPubli" +
      "shStatusResponse\022B\n\020ResponseMetadata\030\001 \001" +
      "(\0132(.Volcengine.Models.Base.ResponseMeta" +
      "data\"\246\001\n\030VodStartWorkflowResponse\022B\n\020Res" +
      "ponseMetadata\030\001 \001(\0132(.Volcengine.Models." +
      "Base.ResponseMetadata\022F\n\006Result\030\002 \001(\01326." +
      "Volcengine.Models.Vod.Business.VodStartW" +
      "orkflowResultB\250\001\n!com.volcengine.model.v" +
      "od.responseB\013VodResponseP\001Z9github.com/v" +
      "olcengine/volc-sdk-golang/models/vod/res" +
      "ponse\240\001\001\330\001\001\312\002\030Volc\\Models\\Vod\\Response\342\002" +
      "\027Volc\\Models\\GPBMetadatab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.volcengine.model.base.Base.getDescriptor(),
          com.volcengine.model.vod.business.VodPlay.getDescriptor(),
          com.volcengine.model.vod.business.VodMedia.getDescriptor(),
          com.volcengine.model.vod.business.VodUpload.getDescriptor(),
          com.volcengine.model.vod.business.VodWorkflow.getDescriptor(),
        });
    internal_static_Volcengine_Models_Vod_Response_VodGetPlayInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Volcengine_Models_Vod_Response_VodGetPlayInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Response_VodGetPlayInfoResponse_descriptor,
        new java.lang.String[] { "ResponseMetadata", "Result", });
    internal_static_Volcengine_Models_Vod_Response_VodGetOriginalPlayInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Volcengine_Models_Vod_Response_VodGetOriginalPlayInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Response_VodGetOriginalPlayInfoResponse_descriptor,
        new java.lang.String[] { "ResponseMetadata", "Result", });
    internal_static_Volcengine_Models_Vod_Response_VodUploadMediaResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Volcengine_Models_Vod_Response_VodUploadMediaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Response_VodUploadMediaResponse_descriptor,
        new java.lang.String[] { "ResponseMetadata", "Result", });
    internal_static_Volcengine_Models_Vod_Response_VodQueryUploadTaskInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Volcengine_Models_Vod_Response_VodQueryUploadTaskInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Response_VodQueryUploadTaskInfoResponse_descriptor,
        new java.lang.String[] { "ResponseMetadata", "Result", });
    internal_static_Volcengine_Models_Vod_Response_VodUrlUploadResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Volcengine_Models_Vod_Response_VodUrlUploadResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Response_VodUrlUploadResponse_descriptor,
        new java.lang.String[] { "ResponseMetadata", "Result", });
    internal_static_Volcengine_Models_Vod_Response_VodApplyUploadInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Volcengine_Models_Vod_Response_VodApplyUploadInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Response_VodApplyUploadInfoResponse_descriptor,
        new java.lang.String[] { "ResponseMetadata", "Result", });
    internal_static_Volcengine_Models_Vod_Response_VodCommitUploadInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Volcengine_Models_Vod_Response_VodCommitUploadInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Response_VodCommitUploadInfoResponse_descriptor,
        new java.lang.String[] { "ResponseMetadata", "Result", });
    internal_static_Volcengine_Models_Vod_Response_VodGetMediaInfosResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_Volcengine_Models_Vod_Response_VodGetMediaInfosResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Response_VodGetMediaInfosResponse_descriptor,
        new java.lang.String[] { "ResponseMetadata", "Result", });
    internal_static_Volcengine_Models_Vod_Response_VodUpdateMediaInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_Volcengine_Models_Vod_Response_VodUpdateMediaInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Response_VodUpdateMediaInfoResponse_descriptor,
        new java.lang.String[] { "ResponseMetadata", });
    internal_static_Volcengine_Models_Vod_Response_VodGetRecommendedPosterResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_Volcengine_Models_Vod_Response_VodGetRecommendedPosterResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Response_VodGetRecommendedPosterResponse_descriptor,
        new java.lang.String[] { "ResponseMetadata", "Result", });
    internal_static_Volcengine_Models_Vod_Response_VodUpdateMediaPublishStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_Volcengine_Models_Vod_Response_VodUpdateMediaPublishStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Response_VodUpdateMediaPublishStatusResponse_descriptor,
        new java.lang.String[] { "ResponseMetadata", });
    internal_static_Volcengine_Models_Vod_Response_VodStartWorkflowResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_Volcengine_Models_Vod_Response_VodStartWorkflowResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Response_VodStartWorkflowResponse_descriptor,
        new java.lang.String[] { "ResponseMetadata", "Result", });
    com.volcengine.model.base.Base.getDescriptor();
    com.volcengine.model.vod.business.VodPlay.getDescriptor();
    com.volcengine.model.vod.business.VodMedia.getDescriptor();
    com.volcengine.model.vod.business.VodUpload.getDescriptor();
    com.volcengine.model.vod.business.VodWorkflow.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
