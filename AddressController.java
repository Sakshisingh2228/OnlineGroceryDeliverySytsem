package com.clickit.controller;

import com.clickit.common.ErrorResponse;
import com.clickit.model.Address;
import com.clickit.model.User;
import com.clickit.service.AddressService;
import com.clickit.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
    AddressService addressService;
	
	@Autowired
    TokenService tokenService;
	
	
	
	@CrossOrigin
	@PostMapping("")
	public ResponseEntity<Object> addAddress(@RequestBody Address address, @RequestHeader String token){
		try {
			User user = tokenService.getUserByToken(token);
			if(user == null) {
				return new ResponseEntity<Object>(new ErrorResponse("User not found"),HttpStatus.BAD_REQUEST);
			}
			
			address.setUserId(user.getUserId().intValue());
			Address add = addressService.addAddress(address);
			return new ResponseEntity<Object>(add,HttpStatus.CREATED);
		} catch (Exception e) {
			
			e.printStackTrace();
			return new ResponseEntity<Object>(new ErrorResponse(e.getMessage()),HttpStatus.BAD_REQUEST);
			
		}
		
	}

}
