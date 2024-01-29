package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class PreviewImageUploadFileExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        PreviewImageUploadFileQuery query = new PreviewImageUploadFileQuery();

        try {
            PreviewImageUploadFileRes resp = service.previewImageUploadFile(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
