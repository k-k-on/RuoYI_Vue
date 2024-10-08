package com.ruoyi.quartz.util;

import org.quartz.JobExecutionContext;
import com.ruoyi.quartz.domain.SysJob;

/**
 * 定时任务处理（允许并发执行）
 *
 * @author LiMengYuan
 * @date 2024/8/27 15:39
 */
public class QuartzJobExecution extends AbstractQuartzJob
{
    @Override
    protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception
    {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
