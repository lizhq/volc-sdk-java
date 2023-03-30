package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.imagex.data.ExtraDim;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXSensibleCacheHitRateByTimeReq {
    @JSONField(name = "Appid")
    private String appid;
    @JSONField(name = "AppVer")
    private List<String> appVer;
    @JSONField(name = "OS")
    private String oS;
    @JSONField(name = "SdkVer")
    private List<String> sdkVer;
    @JSONField(name = "ImageType")
    private List<String> imageType;
    @JSONField(name = "ExtraDims")
    private List<ExtraDim> extraDims;
    @JSONField(name = "GroupBy")
    private String groupBy;
    @JSONField(name = "Type")
    private String type;
    @JSONField(name = "StartTime")
    private String startTime;
    @JSONField(name = "EndTime")
    private String endTime;
    @JSONField(name = "Granularity")
    private String granularity;
}
