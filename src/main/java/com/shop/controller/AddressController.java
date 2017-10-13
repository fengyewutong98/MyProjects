package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.bean.Address;
import com.shop.service.AddressService;

@Controller
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressService addressService;

	@RequestMapping("/select")
	@ResponseBody
	public Address select(Integer addressId) {
		
		return addressService.findByPK(addressId);
	}
}
