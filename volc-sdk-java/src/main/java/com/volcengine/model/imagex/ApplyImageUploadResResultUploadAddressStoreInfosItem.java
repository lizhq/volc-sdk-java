package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * ApplyImageUploadResResultUploadAddressStoreInfosItem
 */
@lombok.Data
public final class ApplyImageUploadResResultUploadAddressStoreInfosItem  {

    /**
     * <p>资源 URI</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>上传凭证</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Auth")
    private String auth;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
