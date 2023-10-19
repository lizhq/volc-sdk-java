package com.volcengine.example.live.v20230101;


import com.volcengine.model.live.v20230101.*;
import com.volcengine.service.live.v20230101.LiveService;

public class DescribeLiveBatchSourceStreamMetricsExample {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeLiveBatchSourceStreamMetricsBody body = new DescribeLiveBatchSourceStreamMetricsBody();

        try {
            DescribeLiveBatchSourceStreamMetricsRes resp = service.describeLiveBatchSourceStreamMetrics(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
