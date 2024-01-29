package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DescribeImageXCdnDurationDetailByTimeExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXCdnDurationDetailByTimeBody body = new DescribeImageXCdnDurationDetailByTimeBody();

        try {
            DescribeImageXCdnDurationDetailByTimeRes resp = service.describeImageXCdnDurationDetailByTime(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
