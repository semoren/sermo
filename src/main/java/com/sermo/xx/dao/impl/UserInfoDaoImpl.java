package com.sermo.xx.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.sermo.xx.dao.UserInfoDao;
import com.sermo.xx.mapper.UserInfoMapper;
import com.sermo.xx.model.UserInfo;

/**
 * @author sermo
 * @version 2016年7月13日 
 */

@Repository
public class UserInfoDaoImpl implements UserInfoDao{

	private @Resource UserInfoMapper mapper;
	
	@Override
	public boolean register(UserInfo userInfo) {
		return mapper.insert(userInfo);
	}

	@Override
	public List<UserInfo> list() {
		return mapper.selectAll();
	}

	@Override
	public UserInfo getUser(String email) {
		return mapper.selectByEmail(email);
	}

	@Override
	public void insertList(List<UserInfo> list) {
		mapper.addTrainRecordBatch(list);
	}

}
