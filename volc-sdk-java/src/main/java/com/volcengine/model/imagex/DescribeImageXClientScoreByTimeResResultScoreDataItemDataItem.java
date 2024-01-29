package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientScoreByTimeResResultScoreDataItemDataItem
 */
@lombok.Data
public final class DescribeImageXClientScoreByTimeResResultScoreDataItemDataItem  {

    /**
     * <p>画质评估在该图片维度的分值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Double value;

    /**
     * <p>数据对应的上报量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>数据对应时间点，按照 ISO8601 表示法，格式为：YYYY-MM-DDThh:mm:ss±hh:mm。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Timestamp")
    private String timestamp;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
