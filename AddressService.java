package com.clickit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickit.dao.AddressDao;
import com.clickit.model.Address;

@Service
public class AddressService {
	@Autowired
	AddressDao addressDao;
	
	public Address addAddress(Address address) {
		addressDao.save(address);
		return address;
		
	}

}
