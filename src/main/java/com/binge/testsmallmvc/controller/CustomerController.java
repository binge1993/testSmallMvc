package com.binge.testsmallmvc.controller;

import java.util.List;
import java.util.Map;

import com.binge.smallmvc.annotation.Action;
import com.binge.smallmvc.annotation.Controller;
import com.binge.smallmvc.annotation.Inject;
import com.binge.smallmvc.bean.Data;
import com.binge.smallmvc.bean.Param;
import com.binge.testsmallmvc.model.Customer;
import com.binge.testsmallmvc.service.CustomerService;

/**
 * 处理客户管理相关请求
 */
@Controller
public class CustomerController {

    @Inject
    private CustomerService customerService;

    /**
     * 进入 客户列表 界面
     */
    @Action("get:/customer")
    public Data index(Param param) {
        List<Customer> customerList = customerService.getCustomerList();
        return new Data(customerList);
    }

    /**
     * 显示客户基本信息
     */
    @Action("get:/customer_show")
    public Data show(Param param) {
        long id = param.getLong("id");
        Customer customer = customerService.getCustomer(id);
        return new Data(customer);
    }

    /**
     * 进入 创建客户 界面
     */
    @Action("get:/customer_create")
    public Data create(Param param) {
        return new Data(true);
    }

    /**
     * 处理 创建客户 请求
     */
    @Action("post:/customer_create")
    public Data createSubmit(Param param) {
        Map<String, Object> fieldMap = param.getFieldMap();
        boolean result = customerService.createCustomer(fieldMap);
        return new Data(result);
    }

    /**
     * 进入 编辑客户 界面
     */
    @Action("get:/customer_edit")
    public Data edit(Param param) {
        long id = param.getLong("id");
        Customer customer = customerService.getCustomer(id);
        return new Data(customer);
    }

    /**
     * 处理 编辑客户 请求
     */
    @Action("put:/customer_edit")
    public Data editSubmit(Param param) {
        long id = param.getLong("id");
        Map<String, Object> fieldMap = param.getFieldMap();
        boolean result = customerService.updateCustomer(id, fieldMap);
        return new Data(result);
    }

    /**
     * 处理 删除客户 请求
     */
    @Action("delete:/customer_edit")
    public Data delete(Param param) {
        long id = param.getLong("id");
        boolean result = customerService.deleteCustomer(id);
        return new Data(result);
    }
}