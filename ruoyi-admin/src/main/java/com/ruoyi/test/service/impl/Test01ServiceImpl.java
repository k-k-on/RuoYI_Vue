package com.ruoyi.test.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.test.mapper.Test01Mapper;
import com.ruoyi.test.domain.Test01;
import com.ruoyi.test.service.ITest01Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 测试Service业务层处理
 *
 * @author ruoyi
 * @date 2024-06-24
 */
@Service
public class Test01ServiceImpl implements ITest01Service
{
    @Resource
    private Test01Mapper test01Mapper;

    /**
     * 查询测试
     *
     * @param id 测试主键
     * @return 测试
     */
    @Override
    public Test01 selectTest01ById(Long id)
    {
        return test01Mapper.selectTest01ById(id);
    }

    /**
     * 查询测试列表
     *
     * @param test01 测试
     * @return 测试
     */
    @Override
    public List<Test01> selectTest01List(Test01 test01)
    {
        return test01Mapper.selectTest01List(test01);
    }

    /**
     * 新增测试
     *
     * @param test01 测试
     * @return 结果
     */
    @Override
    public int insertTest01(Test01 test01)
    {
        return test01Mapper.insertTest01(test01);
    }

    /**
     * 修改测试
     *
     * @param test01 测试
     * @return 结果
     */
    @Override
    public int updateTest01(Test01 test01)
    {
        return test01Mapper.updateTest01(test01);
    }

    /**
     * 批量删除测试
     *
     * @param ids 需要删除的测试主键
     * @return 结果
     */
    @Override
    public int deleteTest01ByIds(Long[] ids)
    {
        return test01Mapper.deleteTest01ByIds(ids);
    }

    /**
     * 删除测试信息
     *
     * @param id 测试主键
     * @return 结果
     */
    @Override
    public int deleteTest01ById(Long id)
    {
        return test01Mapper.deleteTest01ById(id);
    }
}
