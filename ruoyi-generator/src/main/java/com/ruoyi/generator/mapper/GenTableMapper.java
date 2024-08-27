package com.ruoyi.generator.mapper;

import java.util.List;
import com.ruoyi.generator.domain.GenTable;

/**
 * 业务 数据层, 对应gen_table表
 *
 * @author LiMengYuan
 * @date 2024/8/26 15:36
 */
public interface GenTableMapper
{
    /**
     * 查询业务列表,gen_table
     *
     * @param genTable 业务信息
     * @return 业务集合
     */
    List<GenTable> selectGenTableList(GenTable genTable);

    /**
     * 查询据库列表
     *
     * @param genTable 业务信息
     * @return 数据库表集合
     */
    List<GenTable> selectDbTableList(GenTable genTable);

    /**
     * 查询数据库列表，对information_schema.tables视图操作
     *
     * @param tableNames 查询表名称组
     * @return 数据库表查询结果集合
     */
    List<GenTable> selectDbTableListByNames(String[] tableNames);

    /**
     * 查询所有表信息
     *
     * @return 表信息集合
     */
    List<GenTable> selectGenTableAll();

    /**
     * 查询表ID业务信息
     *
     * @param id 业务ID
     * @return 业务信息
     */
    GenTable selectGenTableById(Long id);

    /**
     * 查询表名称业务信息，联结gen_table和gen_table_column进行查询
     *
     * @param tableName 表名称
     * @return 业务信息
     */
    GenTable selectGenTableByName(String tableName);

    /**
     * 新增业务
     *
     * @param genTable 业务信息
     * @return 结果
     */
    int insertGenTable(GenTable genTable);

    /**
     * 修改业务
     *
     * @param genTable 业务信息
     * @return 结果
     */
    int updateGenTable(GenTable genTable);

    /**
     * 批量删除业务
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteGenTableByIds(Long[] ids);

    /**
     * 创建表
     *
     * @param sql 表结构
     * @return 结果
     */
    int createTable(String sql);
}
