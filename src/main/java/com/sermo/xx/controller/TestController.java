package com.sermo.xx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sermo.xx.model.UserInfo;

/**
 * @author sermo
 * @version 2016年7月13日 
 */

@RestController
public class TestController {
	
	@RequestMapping(value="/ss")
	public UserInfo get(){
		return new UserInfo();
	}
}
