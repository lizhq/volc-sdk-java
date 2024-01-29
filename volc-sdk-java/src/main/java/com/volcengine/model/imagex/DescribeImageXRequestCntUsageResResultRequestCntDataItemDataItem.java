package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXRequestCntUsageResResultRequestCntDataItemDataItem
 */
@lombok.Data
public final class DescribeImageXRequestCntUsageResResultRequestCntDataItemDataItem  {

    /**
     * <p>统计时间点，时间片开始时刻。按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>请求次</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Integer value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
