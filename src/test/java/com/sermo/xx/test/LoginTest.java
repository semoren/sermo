package com.sermo.xx.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sermo.components.biz.util.MD5Util;
import com.sermo.xx.dao.UserInfoDao;
import com.sermo.xx.model.UserInfo;

/**
 * @author sermo
 * @version 2016年7月13日 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans/spring-mybatis.xml")
public class LoginTest extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private UserInfoDao dao;
	
	@Test
	public void ss(){
		UserInfo info = new UserInfo();
		info.setEmail("admin@qq.com");
		info.setPassword(MD5Util.encrypt("admin"));
		info.setName("管理员");
		dao.register(info);
	}
}
