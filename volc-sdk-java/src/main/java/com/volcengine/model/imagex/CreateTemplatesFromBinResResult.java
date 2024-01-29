package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateTemplatesFromBinResResult
 */
@lombok.Data
public final class CreateTemplatesFromBinResResult  {

    /**
     * <p>返回各模版恢复的结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Results")
    private List<CreateTemplatesFromBinResResultResultsItem> results;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
