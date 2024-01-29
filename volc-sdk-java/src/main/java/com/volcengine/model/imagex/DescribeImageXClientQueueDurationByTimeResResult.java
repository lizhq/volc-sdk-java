package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXClientQueueDurationByTimeResResult
 */
@lombok.Data
public final class DescribeImageXClientQueueDurationByTimeResResult  {

    /**
     * <p>排队耗时数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DurationData")
    private List<DescribeImageXClientQueueDurationByTimeResResultDurationDataItem> durationData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
