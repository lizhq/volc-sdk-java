package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DeleteImageMigrateTaskQuery
 */
@lombok.Data
public final class DeleteImageMigrateTaskQuery  {

    /**
     * <p>任务地区（即任务目标服务的地区），默认空，返回国内任务。</p>
     *
     *
     *
     * <p>- `cn`：国内</p>
     *
     * <p>- `va`：美东</p>
     *
     * <p>- `sg`：新加坡</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>仅当任务状态为非`Running`时生效。</p>
     *
     * <p>任务 ID，请参考 [GetImageMigrateTasks](https://www.volcengine.com/docs/508/1108670)获取返回的任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
