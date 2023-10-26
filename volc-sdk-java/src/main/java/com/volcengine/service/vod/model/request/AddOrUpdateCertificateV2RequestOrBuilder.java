// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface AddOrUpdateCertificateV2RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.AddOrUpdateCertificateV2Request)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <code>string Domain = 2;</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <code>string Domain = 2;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <code>string DomainType = 3;</code>
   * @return The domainType.
   */
  java.lang.String getDomainType();
  /**
   * <code>string DomainType = 3;</code>
   * @return The bytes for domainType.
   */
  com.google.protobuf.ByteString
      getDomainTypeBytes();

  /**
   * <pre>
   *证书ID
   * </pre>
   *
   * <code>string CertificateId = 4;</code>
   * @return The certificateId.
   */
  java.lang.String getCertificateId();
  /**
   * <pre>
   *证书ID
   * </pre>
   *
   * <code>string CertificateId = 4;</code>
   * @return The bytes for certificateId.
   */
  com.google.protobuf.ByteString
      getCertificateIdBytes();

  /**
   * <code>string HttpsStatus = 5;</code>
   * @return The httpsStatus.
   */
  java.lang.String getHttpsStatus();
  /**
   * <code>string HttpsStatus = 5;</code>
   * @return The bytes for httpsStatus.
   */
  com.google.protobuf.ByteString
      getHttpsStatusBytes();
}