package com.shop.dao;

import org.springframework.stereotype.Repository;

import com.shop.bean.ShoppingCart;
@Repository
public interface ShoppingCartMapper {

	void insert(ShoppingCart shoppingCart);

	void deleteByPK(Integer cartId);

	void deleteByExample(ShoppingCart shoppingCart);

	void updateByPK(ShoppingCart shoppingCart);

	ShoppingCart findByPK(Integer cartId);

	ShoppingCart findByExample(ShoppingCart shoppingCart);

}