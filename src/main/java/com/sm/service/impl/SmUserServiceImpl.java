package com.sm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sm.dao.SmUserMapper;
import com.sm.entity.SmUserDto;
import com.sm.service.SmUserService;

@Component("SmUserServiceImpl")
public class SmUserServiceImpl implements SmUserService {

	@Autowired
	private SmUserMapper smUserMapper;

	@Override
	public int insertSmUser(SmUserDto smUser) {
		return smUserMapper.insertSmUser(smUser);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return smUserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(SmUserDto smUser) {
		return smUserMapper.updateByPrimaryKeySelective(smUser);
	}

	@Override
	public SmUserDto selectByPrimaryKey(Integer id) {
		return smUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageInfo<SmUserDto> selectByExample(SmUserDto smUser) {
		PageHelper.startPage(smUser.getPageNum(), smUser.getPageSize());
		List<SmUserDto> listSmUser = smUserMapper.selectByExample(smUser);
		return new PageInfo<SmUserDto>(listSmUser);
	}

}
