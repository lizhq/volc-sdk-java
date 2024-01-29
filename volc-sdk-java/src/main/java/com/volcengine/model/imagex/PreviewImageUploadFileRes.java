package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * PreviewImageUploadFileRes
 */
@lombok.Data
public final class PreviewImageUploadFileRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private PreviewImageUploadFileResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private PreviewImageUploadFileResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
