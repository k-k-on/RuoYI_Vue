package com.ruoyi.common.exception.file;

/**
 * 文件名大小限制异常类
 *
 * @author LiMengYuan
 * @date 2024/8/27 15:09
 */
public class FileSizeLimitExceededException extends FileException
{
    private static final long serialVersionUID = 1L;

    public FileSizeLimitExceededException(long defaultMaxSize)
    {
        super("upload.exceed.maxSize", new Object[] { defaultMaxSize });
    }
}
