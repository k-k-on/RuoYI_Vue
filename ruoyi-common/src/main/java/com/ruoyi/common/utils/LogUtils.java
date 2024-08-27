package com.ruoyi.common.utils;

//import sun.util.resources.cldr.ext.LocaleNames_my;

/**
 * 处理并记录日志文件
 *
 * @author LiMengYuan
 * @date 2024/8/27 16:03
 */
public class LogUtils
{
    public static String getBlock(Object msg)
    {
        if (msg == null)
        {
            msg = "";
        }
        return "[" + msg + "]";
    }
}
