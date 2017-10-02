package com.binge.smallmvc;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.binge.smallmvc.util.HttpUtil;

/**
 *
 * @author binge
 * @date 2017年10月2日
 */

public class CustomerServiceTest {

	private static final Logger logger = LoggerFactory
			.getLogger(CustomerServiceTest.class);

	private static final String url = "http://localhost:8080/";

	/**
	 * 创建客户
	 */
	@Test
	public void testCreateCustomer() {
		Map<String, String> params = new HashMap<>();

		try {
			HttpUtil.post(url + "customer_create",
					HttpUtil.initParams(url + "customer_create", params));
		} catch (Exception e) {
			System.err.println("failure:" + e.getMessage());
		}
	}

	/**
	 * 获取客户
	 */
	@Test
	public void testGetCustomer() {
		logger.error("sssssssss");
	}

	/**
	 * 获取客户列表
	 */
	@Test
	public void testGetCustomerList() {
	}

	/**
	 * 更新客户
	 */
	@Test
	public void testUpdateCustomer() {
	}

	/**
	 * 删除客户
	 */
	@Test
	public void testDeleteCustomer() {
	}
}
