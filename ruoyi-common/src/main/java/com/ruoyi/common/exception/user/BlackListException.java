package com.ruoyi.common.exception.user;

/**
 * 黑名单IP异常类
 *
 * @author LiMengYuan
 * @date 2024/8/27 15:13
 */
public class BlackListException extends UserException
{
    private static final long serialVersionUID = 1L;

    public BlackListException()
    {
        super("login.blocked", null);
    }
}
