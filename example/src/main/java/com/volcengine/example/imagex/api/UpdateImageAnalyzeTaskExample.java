package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class UpdateImageAnalyzeTaskExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateImageAnalyzeTaskBody body = new UpdateImageAnalyzeTaskBody();

        try {
            UpdateImageAnalyzeTaskRes resp = service.updateImageAnalyzeTask(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
