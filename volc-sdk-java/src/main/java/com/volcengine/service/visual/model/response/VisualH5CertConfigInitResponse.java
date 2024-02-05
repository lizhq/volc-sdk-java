package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualH5CertConfigInitResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    CertConfigInitData data;

    @Data
    public static class CertConfigInitData {
        @JSONField(name = "algorithm_base_resp")
        AlgorithmBaseResp algorithmBaseResp;
        @Data
        public static class AlgorithmBaseResp {
            @JSONField(name = "status_code")
            Integer statusCode;
            @JSONField(name = "status_message")
            String statusMessage;
        }
        @JSONField(name = "config_id")
        String configId;
    }
}