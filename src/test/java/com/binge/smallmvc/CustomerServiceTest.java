package com.binge.smallmvc;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.binge.smallmvc.util.HttpUtil;

/**
 *
 * @author binge
 * @date 2017年10月2日
 */

public class CustomerServiceTest {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(CustomerServiceTest.class);

	private static final Logger logger = LoggerFactory
			.getLogger(CustomerServiceTest.class);

	private static final String url = "http://localhost:8080/";

	/**
	 * 创建客户
	 */
	@Test
	public void testCreateCustomer() { 
		Map<String, String> params = new HashMap<>();
		params.put("name", "binge");
		params.put("contact", "123");
		params.put("telephone", "111"); 
		params.put("email", "292380632@qq.com");
		params.put("remark", "aaa");

		String result = "";
		try {
			String paramsStr = JSON.toJSONString(params);
			result = HttpUtil.httpPost(url + "customer_create", paramsStr);
			LOGGER.info("result:" + result);
		} catch (Exception e) {
			LOGGER.error("failure", e);
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
