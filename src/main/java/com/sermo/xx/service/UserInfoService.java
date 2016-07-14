package com.sermo.xx.service;

import java.util.List;

import com.sermo.xx.model.UserInfo;

/**
 * @author sermo
 * @version 2016年7月13日 
 */

public interface UserInfoService {
	
	/**
	 * 登陆
	 * @param info
	 * @return
	 */
	boolean login(String email, String password);
	
	/**
	 * 注册
	 * @param info
	 */
	boolean register(UserInfo info);
	
	/**
	 * 用户列表
	 * @return
	 */
	List<UserInfo> list();
}
