package com.ruoyi.common.exception.user;

/**
 * 用户不存在异常类
 *
 * @author LiMengYuan
 * @date 2024/8/27 15:14
 */
public class UserNotExistsException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserNotExistsException()
    {
        super("user.not.exists", null);
    }
}
