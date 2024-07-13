package com.ruoyi.test.service;

import java.util.List;
import com.ruoyi.test.domain.Test01;

/**
 * 测试Service接口
 * 
 * @author ruoyi
 * @date 2024-06-24
 */
public interface ITest01Service 
{
    /**
     * 查询测试
     * 
     * @param id 测试主键
     * @return 测试
     */
    Test01 selectTest01ById(Long id);

    /**
     * 查询测试列表
     * 
     * @param test01 测试
     * @return 测试集合
     */
    List<Test01> selectTest01List(Test01 test01);

    /**
     * 新增测试
     * 
     * @param test01 测试
     * @return 结果
     */
    int insertTest01(Test01 test01);

    /**
     * 修改测试
     * 
     * @param test01 测试
     * @return 结果
     */
    int updateTest01(Test01 test01);

    /**
     * 批量删除测试
     * 
     * @param ids 需要删除的测试主键集合
     * @return 结果
     */
    int deleteTest01ByIds(Long[] ids);

    /**
     * 删除测试信息
     * 
     * @param id 测试主键
     * @return 结果
     */
    int deleteTest01ById(Long id);
}
