package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientDecodeSuccessRateByTimeRes
 */
@lombok.Data
public final class DescribeImageXClientDecodeSuccessRateByTimeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeImageXClientDecodeSuccessRateByTimeResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeImageXClientDecodeSuccessRateByTimeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
