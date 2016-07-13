package com.sermo.xx.service;

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
	boolean login(UserInfo info);
	
	/**
	 * 注册
	 * @param info
	 */
	boolean register(UserInfo info);
	
}
