package com.volcengine.example.vod.media;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodGetMediaInfosRequest;
import com.volcengine.service.vod.model.response.VodGetMediaInfosResponse;

public class GetMediaInfosDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String vids = "vid1,vid2,vid3";

        try {
            VodGetMediaInfosRequest.Builder req = VodGetMediaInfosRequest.newBuilder();
            req.setVids(vids);

            VodGetMediaInfosResponse resp = vodService.getMediaInfos(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
