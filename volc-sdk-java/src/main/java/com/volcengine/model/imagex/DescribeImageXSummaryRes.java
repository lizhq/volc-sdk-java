package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSummaryRes
 */
@lombok.Data
public final class DescribeImageXSummaryRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXSummaryResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXSummaryResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
