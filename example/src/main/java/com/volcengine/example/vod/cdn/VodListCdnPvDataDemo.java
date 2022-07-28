// Code generated by protoc-gen-volcengine-sdk
// source: listCdnPvData
// DO NOT EDIT!

package com.volcengine.example.vod.cdn;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodListCdnPvDataDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodListCdnPvDataRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodListCdnPvDataRequest.newBuilder();
			reqBuilder.setDomains("your Domains");
			reqBuilder.setInterval("your Interval");
			reqBuilder.setStartTimestamp(0);
			reqBuilder.setEndTimestamp(0);
			reqBuilder.setDataType("your DataType");
			
            com.volcengine.service.vod.model.response.VodCdnStatisticsCommonResponse resp = vodService.listCdnPvData(reqBuilder.build());
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