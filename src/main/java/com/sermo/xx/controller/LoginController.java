package com.sermo.xx.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sermo.xx.model.UserInfo;
import com.sermo.xx.service.UserInfoService;

/**
 * @author sermo
 * @version 2016年7月12日 
 */
@Controller
public class LoginController {
	
	private @Resource UserInfoService service;
	
	private Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value="/login", method={RequestMethod.POST, RequestMethod.GET})
	public void login(UserInfo info) {
		boolean flag = service.login(info);
		if (flag) {
			logger.debug("登陆成功");
		}else {
			logger.debug("登陆失败");
		}
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public void register(UserInfo info) {
		service.register(info);
	}
}
