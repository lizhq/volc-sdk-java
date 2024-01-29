package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * PreviewImageUploadFileQuery
 */
@lombok.Data
public final class PreviewImageUploadFileQuery  {

    /**
     * <p>服务 ID。</p>
     *
     * <p>- 您可以在 veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>文件 Uri。</p>
     *
     * <p>- 您可以在 veImageX 控制台 [资源管理](https://console.volcengine.com/imagex/resource_manage/)页面，在已上传文件的名称列获取资源 Uri。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取Uri，具体请参考[文件上传完成上报](https://www.volcengine.com/docs/508/9398)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
