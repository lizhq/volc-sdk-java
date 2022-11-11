// Code generated by protoc-gen-volcengine-sdk
// source: listPullToPushTask
// DO NOT EDIT!

package com.volcengine.service.live.pull_to_push_task;

import com.volcengine.service.live.ILiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

public class LiveListPullToPushTaskDemo {

    public static void main(String[] args) throws Exception {
        ILiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your ak");
        liveService.setSecretKey("your sk");

        try {
            com.volcengine.service.live.model.request.ListPullToPushTaskRequest.Builder reqBuilder = com.volcengine.service.live.model.request.ListPullToPushTaskRequest.newBuilder();
			reqBuilder.setPage(0);
			reqBuilder.setSize(0);
			reqBuilder.setTitle("your Title");
			
            com.volcengine.service.live.model.response.ListPullToPushTaskResponse resp = liveService.listPullToPushTask(reqBuilder.build());
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