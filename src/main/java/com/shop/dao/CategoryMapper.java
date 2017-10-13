package com.shop.dao;

import org.springframework.stereotype.Repository;

import com.shop.bean.Category;
@Repository
public interface CategoryMapper {

	void insert(Category category);

	void deleteByPK(Integer categoryId);

	void deleteByExample(Category category);

	void updateByPK(Category category);

	Category findByPK(Integer categoryId);

	Category findByExample(Category category);

}