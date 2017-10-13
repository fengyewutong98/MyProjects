package com.shop.service;

import org.springframework.stereotype.Service;

import com.shop.bean.Address;

@Service("AddressService")
public interface AddressService {
	
	void insert(Address address);

	void deleteByPK(Integer addressId);

	void deleteByExample(Address address);

	void updateByPK(Address address);

	Address findByPK(Integer addressId);

	Address findByExample(Address address);
}
