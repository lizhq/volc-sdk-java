package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetAllImageServicesResResultServicesItemResourceTagsItem
 */
@lombok.Data
public final class GetAllImageServicesResResultServicesItemResourceTagsItem  {

    /**
     * <p>标签键</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Key")
    private String key;

    /**
     * <p>标签值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
