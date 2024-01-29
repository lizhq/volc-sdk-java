package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXRequestCntUsageQuery
 */
@lombok.Data
public final class DescribeImageXRequestCntUsageQuery  {

    /**
     * <p>服务 ID。为空时表示不筛选，支持查询多个服务，使用英文逗号分隔不同的服务。</p>
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
     * <p>组件名称。为空时表示不筛选，支持查询多个`AdvFeat`，不同的`AdvFeat`使用英文逗号分隔。</p>
     *
     * <p>您可通过调用 [GetImageAddOnConf](https://www.volcengine.com/docs/508/66145) 查看`Key`返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AdvFeats")
    private String advFeats;

    /**
     * <p>模版。为空时表示不筛选，支持查询多个模板，不同的模板使用英文逗号分隔。</p>
     *
     * <p>您可通过调用 [GetAllImageTemplates](https://www.volcengine.com/docs/508/9386) 获取服务下全部模版信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Templates")
    private String templates;

    /**
     * <p>维度拆分的维度值。不传表示不拆分维度，只能传入单个参数。支持取值如下：</p>
     *
     * <p>- `ServiceId`</p>
     *
     * <p>- `AdvFeat`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupBy")
    private String groupBy;

    /**
     * <p>获取数据起始时间点。日期格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如`2019-06-02T00:00:00+08:00`。</p>
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
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>查询数据的时间粒度。单位为秒。缺省时查询 StartTime 和 EndTime 时间段全部数据，此时单次查询最大时间跨度为 93 天。支持取值如下：</p>
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
    private String interval;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
