package com.shop.dao;

import org.springframework.stereotype.Repository;

import com.shop.bean.Order;
@Repository
public interface OrderMapper {

	void insert(Order order);

	void deleteByPK(Integer orderId);

	void deleteByExample(Order order);

	void updateByPK(Order order);

	Order findByPK(Integer orderId);

	Order findByExample(Order order);

}