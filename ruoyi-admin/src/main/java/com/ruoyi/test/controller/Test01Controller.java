package com.ruoyi.test.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.test.domain.Test01;
import com.ruoyi.test.service.ITest01Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测试Controller
 * 
 * @author ruoyi
 * @date 2024-06-24
 */
@RestController
@RequestMapping("/test/testuser")
public class Test01Controller extends BaseController
{
    @Autowired
    private ITest01Service test01Service;

    /**
     * 查询测试列表
     */
    @PreAuthorize("@ss.hasPermi('test:testuser:list')")
    @GetMapping("/list")
    public TableDataInfo list(Test01 test01)
    {
        startPage();
        List<Test01> list = test01Service.selectTest01List(test01);
        return getDataTable(list);
    }

    /**
     * 导出测试列表
     */
    @PreAuthorize("@ss.hasPermi('test:testuser:export')")
    @Log(title = "测试", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Test01 test01)
    {
        List<Test01> list = test01Service.selectTest01List(test01);
        ExcelUtil<Test01> util = new ExcelUtil<> (Test01.class);
        util.exportExcel(response, list, "测试数据");
    }

    /**
     * 获取测试详细信息
     */
    @PreAuthorize("@ss.hasPermi('test:testuser:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(test01Service.selectTest01ById(id));
    }

    /**
     * 新增测试
     */
    @PreAuthorize("@ss.hasPermi('test:testuser:add')")
    @Log(title = "测试", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Test01 test01)
    {
        return toAjax(test01Service.insertTest01(test01));
    }

    /**
     * 修改测试
     */
    @PreAuthorize("@ss.hasPermi('test:testuser:edit')")
    @Log(title = "测试", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Test01 test01)
    {
        return toAjax(test01Service.updateTest01(test01));
    }

    /**
     * 删除测试
     */
    @PreAuthorize("@ss.hasPermi('test:testuser:remove')")
    @Log(title = "测试", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(test01Service.deleteTest01ByIds(ids));
    }
}
