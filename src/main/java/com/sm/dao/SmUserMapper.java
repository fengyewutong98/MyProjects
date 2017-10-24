package com.sm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sm.entity.SmUserDto;
@Repository
public interface SmUserMapper {

	int insertSmUser(SmUserDto smUser);

	int deleteByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SmUserDto smUser);

	SmUserDto selectByPrimaryKey(Integer id);

	List<SmUserDto> selectByExample(SmUserDto smUser);

}
