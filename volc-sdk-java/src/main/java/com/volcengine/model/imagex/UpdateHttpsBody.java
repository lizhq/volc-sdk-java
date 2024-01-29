package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * UpdateHttpsBody
 */
@lombok.Data
public final class UpdateHttpsBody  {

    /**
     * <p>域名，您可以通过[获取服务下全部域名](https://www.volcengine.com/docs/508/9379)获取服务下域名信息。 </p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "domain")
    private String domain;

    /**
     * <p>https 配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "https")
    private UpdateHttpsBodyHttps https;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
