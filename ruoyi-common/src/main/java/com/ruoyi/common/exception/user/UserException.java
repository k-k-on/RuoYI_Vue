package com.ruoyi.common.exception.user;

import com.ruoyi.common.exception.base.BaseException;

/**
 * 用户信息异常类
 *
 * @author LiMengYuan
 * @date 2024/8/27 15:13
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
