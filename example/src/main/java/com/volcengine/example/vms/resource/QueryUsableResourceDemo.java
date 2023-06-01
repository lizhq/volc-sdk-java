package com.volcengine.example.vms.resource;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.NotifyService;
import com.volcengine.service.vms.impl.NotifyServiceImpl;
import com.volcengine.service.vms.response.CommonResponse;
import com.volcengine.service.vms.response.ResourceResult;

import java.util.List;

/**
 * @author huangxing
 * @Date 2023/1/9
 */
public class QueryUsableResourceDemo {
    public static void main(String[] args) {

        NotifyService notifyService = NotifyServiceImpl.getInstance();

        notifyService.setAccessKey("your ak");
        notifyService.setSecretKey("your sk");


        try {
            CommonResponse<List<ResourceResult>> commonResponse = notifyService.queryUsableResource(0);
            System.out.println(JSON.toJSONString(commonResponse));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}