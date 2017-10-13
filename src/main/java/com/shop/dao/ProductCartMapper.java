package com.shop.dao;

import org.springframework.stereotype.Repository;

import com.shop.bean.ProductCart;
@Repository
public interface ProductCartMapper {

	void insert(ProductCart productCart);

	void deleteByPK(Integer id);

	void deleteByExample(ProductCart productCart);

	void updateByPK(ProductCart productCart);

	ProductCart findByPK(Integer id);

	ProductCart findByExample(ProductCart productCart);

}