package com.ruoyi.common.filter;

import com.alibaba.fastjson2.filter.SimplePropertyPreFilter;

/**
 * 排除JSON敏感属性
 *
 * @author LiMengYuan
 * @date 2024/8/27 15:15
 */
public class PropertyPreExcludeFilter extends SimplePropertyPreFilter
{
    public PropertyPreExcludeFilter()
    {
    }

    public PropertyPreExcludeFilter addExcludes(String... filters)
    {
        for (String filter : filters) {
            this.getExcludes ().add (filter);
        }
        return this;
    }
}
