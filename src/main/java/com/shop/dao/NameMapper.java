package com.shop.dao;

import org.springframework.stereotype.Repository;

import com.shop.bean.Name;
@Repository
public interface NameMapper {

	void insert(Name name);

	void deleteByPK(Integer id);

	void deleteByExample(Name name);

	void updateByPK(Name name);

	Name findByPK(Integer id);

	Name findByExample(Name name);

}