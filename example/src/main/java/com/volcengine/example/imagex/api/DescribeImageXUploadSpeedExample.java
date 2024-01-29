package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXUploadSpeedExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXUploadSpeedBody body = new DescribeImageXUploadSpeedBody();

        try {
            DescribeImageXUploadSpeedRes resp = service.describeImageXUploadSpeed(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
