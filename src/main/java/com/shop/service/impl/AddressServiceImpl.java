package com.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shop.bean.Address;
import com.shop.dao.AddressMapper;
import com.shop.service.AddressService;

@Component("AddressServiceImpl")
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressMapper addressMapper;

	@Override
	public void insert(Address address) {
		addressMapper.insert(address);
	}

	@Override
	public void deleteByPK(Integer addressId) {
		addressMapper.deleteByPK(addressId);
	}

	@Override
	public void deleteByExample(Address address) {
		addressMapper.deleteByExample(address);
	}

	@Override
	public void updateByPK(Address address) {
		addressMapper.updateByPK(address);
	}

	@Override
	public Address findByPK(Integer addressId) {
		return addressMapper.findByPK(addressId);
	}

	@Override
	public Address findByExample(Address address) {
		return addressMapper.findByExample(address);
	}

}
