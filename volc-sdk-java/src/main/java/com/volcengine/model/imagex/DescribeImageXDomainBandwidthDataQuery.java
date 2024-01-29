package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXDomainBandwidthDataQuery
 */
@lombok.Data
public final class DescribeImageXDomainBandwidthDataQuery  {

    /**
     * <p>服务 ID。为空时表示不筛选，支持查询多个服务，使用逗号分隔不同的服务。</p>
     *
     *
     *
     * <p>- 您可以在 veImageX 控制台[服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考 [GetAllImageServices](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceIds")
    private String serviceIds;

    /**
     * <p>域名。为空时表示不筛选，支持查询多个域名，不同的域名使用逗号分隔。</p>
     *
     * <p>您可以通过调用 [GetServiceDomains](https://www.volcengine.com/docs/508/9379) 获取服务下所有域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainNames")
    private String domainNames;

    /**
     * <p>过滤计费区域。不传表示不过滤，传入多个用英文逗号分隔。支持取值如下：</p>
     *
     *
     *
     * <p>- `CHN`：中国内地</p>
     *
     * <p>- `AP1`：亚太一区</p>
     *
     * <p>- `AP2`：亚太二区</p>
     *
     * <p>- `AP3`：亚太三区</p>
     *
     * <p>- `EU`：欧洲</p>
     *
     * <p>- `ME`：中东和非洲</p>
     *
     * <p>- `SA`：南美</p>
     *
     * <p>- `NA`：北美</p>
     *
     * <p>- `OTHER`：其他</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BillingRegion")
    private String billingRegion;

    /**
     * <p>需要分组查询的参数。不传表示不拆分维度，传入多个用英文逗号分隔。支持取值如下：</p>
     *
     *
     *
     * <p>- `ServiceId`：服务 ID</p>
     *
     * <p>- `DomainName` ：域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupBy")
    private String groupBy;

    /**
     * <p>取数据起始时间点。日期格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如`2019-06-02T00:00:00+08:00`。</p>
     *
     * <p>:::tip</p>
     *
     * <p>由于仅支持查询近一年历史数据，则若此刻时间为`2011-11-21T16:14:00+08:00`，那么您可输入最早的开始时间为`2010-11-21T00:00:00+08:00`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>获取数据结束时间点。日期格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如`2019-06-02T00:00:00+08:00`。</p>
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>查询数据的时间粒度。单位为秒。缺省时查询 `StartTime` 和 `EndTime` 时间段全部数据，此时单次查询最大时间跨度为 93 天。支持取值如下：</p>
     *
     *
     *
     * <p>- `300`：单次查询最大时间跨度为 31 天</p>
     *
     * <p>- `600`：单次查询最大时间跨度为 31 天</p>
     *
     * <p>- `1200`：单次查询最大时间跨度为 31 天</p>
     *
     * <p>- `1800`：单次查询最大时间跨度为 31 天</p>
     *
     * <p>- `3600`：单次查询最大时间跨度为 93 天</p>
     *
     * <p>- `86400`：单次查询最大时间跨度为 93 天</p>
     *
     * <p>- `604800`：单次查询最大时间跨度为 93 天</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Integer interval;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
