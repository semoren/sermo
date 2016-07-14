package com.sermo.xx.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String toLogin(ModelMap map) {
		map.put("title", "登陆"); // 设置页面title
		return "login/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(String email, String password, HttpSession session) {
		boolean flag = service.login(email, password);
		if (flag) {
			session.setAttribute("userId", email);
			logger.debug("{} login success", email);
			return "redirect:/confirmLogin";
		}else {
			logger.debug("{} login fail", email);
			return "login/login";
		}
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String toRegister(ModelMap map) {
		map.put("title", "注册"); // 设置页面title
		return "login/registration";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(UserInfo info) {
		boolean flag = service.register(info);
		if (flag) {
			return "redirect:/login";
		}
		return null;
	}
	
	/**
	 * 首页
	 * @return
	 */
	@RequestMapping(value="/confirmLogin")
	public String home() {
		return "leftmenu";
	}
}
