package com.shop.dao;

import org.springframework.stereotype.Repository;

import com.shop.bean.User;
@Repository
public interface UserMapper {

	void insert(User user);

	void deleteByPK(Integer userId);

	void deleteByExample(User user);

	void updateByPK(User user);

	User findByPK(Integer userId);

	User findByExample(User user);

}