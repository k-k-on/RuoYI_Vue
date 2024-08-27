package com.ruoyi.framework.security.context;

import org.springframework.security.core.Authentication;

/**
 * 身份验证信息
 *
 * @author LiMengYuan
 * @date 2024/8/27 11:26
 */
public class AuthenticationContextHolder
{
    private static final ThreadLocal<Authentication> contextHolder = new ThreadLocal<>();

    public static Authentication getContext()
    {
        return contextHolder.get();
    }

    public static void setContext(Authentication context)
    {
        contextHolder.set(context);
    }

    public static void clearContext()
    {
        contextHolder.remove();
    }
}
