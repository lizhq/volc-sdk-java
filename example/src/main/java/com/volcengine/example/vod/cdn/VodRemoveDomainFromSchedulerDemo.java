// Code generated by protoc-gen-volcengine-sdk
// source: removeDomainFromScheduler
// DO NOT EDIT!

package com.volcengine.example.vod.cdn;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodRemoveDomainFromSchedulerDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodRemoveDomainFromSchedulerRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodRemoveDomainFromSchedulerRequest.newBuilder();
			reqBuilder.setSpaceName("your SpaceName");
			reqBuilder.setDomainType("your DomainType");
			reqBuilder.setDomain("your Domain");
			reqBuilder.setSourceStationType(0);
			
            com.volcengine.service.vod.model.response.VodRemoveDomainFromSchedulerResponse resp = vodService.removeDomainFromScheduler(reqBuilder.build());
            if (resp.getResponseMetadata().hasError()) {
                System.out.println(resp.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}