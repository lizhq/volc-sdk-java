package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXSensibleCacheHitRateByTimeResResultCacheHitDataItem
 */
@lombok.Data
public final class DescribeImageXSensibleCacheHitRateByTimeResResultCacheHitDataItem  {

    /**
     * <p>数据类型，不拆分时值为`Total`，拆分时为具体的维度值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>该数据类型对应的总上报量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>具体数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXSensibleCacheHitRateByTimeResResultCacheHitDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
