// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/business/domain.proto

package com.volcengine.service.live.model.business;

public final class Domain {
  private Domain() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Live_Models_Business_DomainList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Live_Models_Business_DomainList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Live_Models_Business_DomainListInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Live_Models_Business_DomainListInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\032live/business/domain.proto\022\037Volcengine" +
      ".Live.Models.Business\"\202\002\n\nDomainList\022\r\n\005" +
      "Vhost\030\001 \001(\t\022\016\n\006Domain\030\002 \001(\t\022\016\n\006Status\030\003 " +
      "\001(\003\022\014\n\004Type\030\004 \001(\t\022\016\n\006Region\030\005 \001(\t\022\r\n\005CNa" +
      "me\030\006 \001(\t\022\022\n\nCnameCheck\030\007 \001(\003\022\023\n\013DomainCh" +
      "eck\030\010 \001(\003\022\020\n\010ICPCheck\030\t \001(\003\022\022\n\nCreateTim" +
      "e\030\n \001(\t\022\022\n\nCertDomain\030\013 \001(\t\022\017\n\007ChainID\030\014" +
      " \001(\t\022\020\n\010CertName\030\r \001(\t\022\022\n\nPushDomain\030\016 \001" +
      "(\t\"`\n\016DomainListInfo\022?\n\nDomainList\030\001 \003(\013" +
      "2+.Volcengine.Live.Models.Business.Domai" +
      "nList\022\r\n\005Total\030\002 \001(\003B\316\001\n*com.volcengine." +
      "service.live.model.businessB\006DomainP\001ZBg" +
      "ithub.com/volcengine/volc-sdk-golang/ser" +
      "vice/live/models/business\240\001\001\330\001\001\302\002\000\312\002!Vol" +
      "c\\Service\\Live\\Models\\Business\342\002$Volc\\Se" +
      "rvice\\Live\\Models\\GPBMetadatab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Volcengine_Live_Models_Business_DomainList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Volcengine_Live_Models_Business_DomainList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Live_Models_Business_DomainList_descriptor,
        new String[] { "Vhost", "Domain", "Status", "Type", "Region", "CName", "CnameCheck", "DomainCheck", "ICPCheck", "CreateTime", "CertDomain", "ChainID", "CertName", "PushDomain", });
    internal_static_Volcengine_Live_Models_Business_DomainListInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Volcengine_Live_Models_Business_DomainListInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Live_Models_Business_DomainListInfo_descriptor,
        new String[] { "DomainList", "Total", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}