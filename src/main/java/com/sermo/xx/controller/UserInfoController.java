package com.sermo.xx.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sermo.xx.model.UserInfo;
import com.sermo.xx.service.UserInfoService;

/**
 * @author sermo
 * @version 2016年7月14日 
 */

@Controller
@RequestMapping(value="/userInfo")
public class UserInfoController {
	
	private @Resource UserInfoService service;
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String list(ModelMap map) {
		List<UserInfo> userInfos = service.list();
		map.put("userInfos", userInfos);
		return "userInfo/list";
	}
}
