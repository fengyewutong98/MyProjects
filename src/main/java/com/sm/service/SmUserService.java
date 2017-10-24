package com.sm.service;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.sm.entity.SmUserDto;

@Service(value = "SmUserService")
public interface SmUserService {
	
	int insertSmUser(SmUserDto smUser);

	int deleteByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SmUserDto smUser);

	SmUserDto selectByPrimaryKey(Integer id);

	PageInfo<SmUserDto> selectByExample(SmUserDto smUser, int pageNum, int pageSize);
}
