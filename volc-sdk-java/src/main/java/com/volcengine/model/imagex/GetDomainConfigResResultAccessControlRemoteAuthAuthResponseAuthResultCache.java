package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetDomainConfigResResultAccessControlRemoteAuthAuthResponseAuthResultCache
 */
@lombok.Data
public final class GetDomainConfigResResultAccessControlRemoteAuthAuthResponseAuthResultCache  {

    /**
     * <p>是否缓存鉴权状态码，取值如下所示：</p>
     *
     *
     *
     * <p>- `nocache`：veImageX 不缓存鉴权状态码。</p>
     *
     * <p>- `cache`：veImageX 缓存鉴权状态码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "action")
    private String action;

    /**
     * <p>缓存 key 指定了用于区分不同请求 URI 的查询参数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "cache_key")
    private List<String> cacheKey;

    /**
     * <p>鉴权状态码的缓存时间，单位是秒</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ttl")
    private Integer ttl;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
