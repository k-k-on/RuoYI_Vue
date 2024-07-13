package com.ruoyi.test.mapper;

import java.util.List;
import com.ruoyi.test.domain.Test01;

/**
 * 测试Mapper接口
 * 
 * @author ruoyi
 * @date 2024-06-24
 */
public interface Test01Mapper 
{
    /**
     * 查询测试
     * 
     * @param id 测试主键
     * @return 测试
     */
    public Test01 selectTest01ById(Long id);

    /**
     * 查询测试列表
     * 
     * @param test01 测试
     * @return 测试集合
     */
    public List<Test01> selectTest01List(Test01 test01);

    /**
     * 新增测试
     * 
     * @param test01 测试
     * @return 结果
     */
    public int insertTest01(Test01 test01);

    /**
     * 修改测试
     * 
     * @param test01 测试
     * @return 结果
     */
    public int updateTest01(Test01 test01);

    /**
     * 删除测试
     * 
     * @param id 测试主键
     * @return 结果
     */
    public int deleteTest01ById(Long id);

    /**
     * 批量删除测试
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTest01ByIds(Long[] ids);
}
