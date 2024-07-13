package com.ruoyi.common.utils;

import sun.util.resources.cldr.ext.LocaleNames_my;

/**
 * 处理并记录日志文件
 * 
 * @author ruoyi
 */
public class LogUtils
{
    public static String getBlock(Object msg)
    {
        if (msg == null)
        {
            msg = "";
        }
        /*对 'toString()' 的调用不必要 BY LMY */
        return "[" + msg + "]";
    }
}
