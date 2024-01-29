package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DelDomainBody
 */
@lombok.Data
public final class DelDomainBody  {

    /**
     * <p>域名，您可以通过 [获取服务下全部域名](https://www.volcengine.com/docs/508/9379) 获取服务下域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
