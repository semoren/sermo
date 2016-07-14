package com.sermo.xx.mapper;

import java.util.List;

import com.sermo.xx.model.UserInfo;

public interface UserInfoMapper {
	
	boolean insert(UserInfo record);
	
	List<UserInfo> selectAll();
	
	UserInfo selectByEmail(String email);
	
	void addTrainRecordBatch(List<UserInfo> list);
	
	int deleteByPrimaryKey(String id);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}