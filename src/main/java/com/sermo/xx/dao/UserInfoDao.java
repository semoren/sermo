package com.sermo.xx.dao;

import java.util.List;

import com.sermo.xx.model.UserInfo;

/**
 * @author sermo
 * @version 2016年7月13日 
 */
public interface UserInfoDao {
	
	/**
	 * 注册用户
	 * @param userInfo
	 */
	boolean register(UserInfo userInfo);
	
	List<UserInfo> list();
	
	UserInfo getUser(String email);
}
