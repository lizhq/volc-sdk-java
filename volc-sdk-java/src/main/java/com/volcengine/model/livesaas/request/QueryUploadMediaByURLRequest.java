package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class QueryUploadMediaByURLRequest {
    @JSONField(name = "TaskID")
    String TaskID;
}