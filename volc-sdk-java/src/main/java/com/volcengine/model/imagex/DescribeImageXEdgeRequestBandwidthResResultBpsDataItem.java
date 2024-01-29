package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXEdgeRequestBandwidthResResultBpsDataItem
 */
@lombok.Data
public final class DescribeImageXEdgeRequestBandwidthResResultBpsDataItem  {

    /**
     * <p>具体数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXEdgeRequestBandwidthResResultBpsDataItemDataItem> data;

    /**
     * <p>域名，仅当`GroupBy`取值为`DomainName`时返回该参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainName")
    private String domainName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
