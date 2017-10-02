package com.binge.testsmallmvc.service;

import java.util.List;
import java.util.Map;

import com.binge.smallmvc.annotation.Service;
import com.binge.smallmvc.annotation.Transaction;
import com.binge.smallmvc.helper.DruidDatabaseHelper;
import com.binge.testsmallmvc.model.Customer;

/**
 * 提供客户数据服务
 */
@Service
public class CustomerService {

    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DruidDatabaseHelper.queryEntityList(Customer.class, sql);
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id) {
        String sql = "SELECT * FROM customer WHERE id = ?";
        return DruidDatabaseHelper.queryEntity(Customer.class, sql, id);
    }

    /**
     * 创建客户
     */
    @Transaction
    public boolean createCustomer(Map<String, Object> fieldMap) {
    	DruidDatabaseHelper.insertEntity(Customer.class, fieldMap);
    	
        DruidDatabaseHelper.insertEntity(Customer.class, fieldMap);
        throw new RuntimeException("aa");
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DruidDatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id) {
		return DruidDatabaseHelper.deleteEntity(Customer.class, id);
    }

}
