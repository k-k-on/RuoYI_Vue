package com.ruoyi.common.enums;

/**
 * 限流类型
 *
 * @author LiMengYuan
 * @date 2024/8/27 15:05
 */
public enum LimitType
{
    /**
     * 默认策略全局限流
     */
    DEFAULT,

    /**
     * 根据请求者IP进行限流
     */
    IP
}
