package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetServiceDomainsResResultItemLockStatus
 */
@lombok.Data
public final class GetServiceDomainsResResultItemLockStatus  {

    /**
     * <p>整个域名是否锁定，取值如下所示：</p>
     *
     * <p>- `true`：是，您无法手动修改其配置。如需修改，请[提交工单](https://console.volcengine.com/workorder/create?step=2&SubProductID=P00000080)联系技术支持。</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "domain_locked")
    private Boolean domainLocked;

    /**
     * <p>智能压缩是否锁定，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "compression_locked")
    private Boolean compressionLocked;

    /**
     * <p>IP 访问限制是否锁定，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ip_access_rule_locked")
    private Boolean ipAccessRuleLocked;

    /**
     * <p>Referer 防盗链是否锁定，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "referer_access_rule_locked")
    private Boolean refererAccessRuleLocked;

    /**
     * <p>远程鉴权是否锁定，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "remote_auth_locked")
    private Boolean remoteAuthLocked;

    /**
     * <p>响应头是否锁定，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "response_header_locked")
    private Boolean responseHeaderLocked;

    /**
     * <p>URL 鉴权是否锁定，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "sign_url_auth_locked")
    private Boolean signUrlAuthLocked;

    /**
     * <p>UA 访问限制是否锁定，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ua_access_rule_locked")
    private Boolean uaAccessRuleLocked;

    /**
     * <p>域名被锁定原因</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "reason")
    private String reason;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
