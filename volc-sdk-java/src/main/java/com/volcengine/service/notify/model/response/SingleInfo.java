package com.volcengine.service.notify.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;


/**
 * @author kaede
 * @className SingleInfo
 * @date 2021/12/20 3:10 下午
 */
@Data
public class SingleInfo {
    @JSONField(name = "SingleOpenId")
    private String singleOpenId;

    @JSONField(name = "Resource")
    private String resource;

    @JSONField(name = "Phone")
    private String phone;

    @JSONField(name = "Ext")
    private String ext;

    @JSONField(name = "CreateTime",format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JSONField(name = "State")
    private String state;

    @JSONField(name = "ReleaseTime",format="yyyy-MM-dd HH:mm:ss")
    private Date releaseTime;

    @JSONField(name = "Duration")
    private Integer duration;
}
