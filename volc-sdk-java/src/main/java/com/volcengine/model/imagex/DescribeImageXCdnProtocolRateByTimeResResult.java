package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXCdnProtocolRateByTimeResResult
 */
@lombok.Data
public final class DescribeImageXCdnProtocolRateByTimeResResult  {

    /**
     * <p>各协议占比数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProtocolRateData")
    private List<DescribeImageXCdnProtocolRateByTimeResResultProtocolRateDataItem> protocolRateData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
