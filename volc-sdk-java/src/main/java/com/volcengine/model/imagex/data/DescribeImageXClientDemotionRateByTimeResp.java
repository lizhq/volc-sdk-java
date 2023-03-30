package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.imagex.data.CurveFloatItem;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXClientDemotionRateByTimeResp {
    @JSONField(name = "DemotionRateData")
    private List<CurveFloatItem> demotionRateData;
}
