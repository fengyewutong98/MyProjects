package com.shop.dao;

import org.springframework.stereotype.Repository;

import com.shop.bean.Address;

@Repository
public interface AddressMapper {

	void insert(Address address);

	void deleteByPK(Integer addressId);

	void deleteByExample(Address address);

	void updateByPK(Address address);

	Address findByPK(Integer addressId);

	Address findByExample(Address address);

}