package com.clickit.service;

import java.util.Date;
import java.util.UUID;

import io.jsonwebtoken.Jwts;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickit.dao.TokenDao;
import com.clickit.model.Token;
import com.clickit.model.User;

@Service
public class TokenService {
	
	@Autowired
	TokenDao tokenDao;
	
	@Autowired
	UserService userService;

	public Token generateToken(User user) {

		Token existingUserToken = tokenDao.findByUser(user);
		if(existingUserToken != null){
			return existingUserToken;
		}

		 String jwtToken = jwtTokenGenerator(user);
	     Token token = new Token();
		 token.setToken(jwtToken);
		 token.setUser(user);
	     token = tokenDao.save(token);
		return token;
	}


	private String jwtTokenGenerator(User user){
		final Date currentDateTime = new Date();
		String jwtToken = Jwts.builder()
				.claim("name", user.getName())
				.claim("email", user.getEmail())
				.setSubject("login")
				.setId(UUID.randomUUID().toString())
				.setIssuedAt(currentDateTime)
				.setExpiration(DateUtils.addMonths(currentDateTime, 1))
				.compact();
		return  jwtToken;
	}

	public void logout(String token) {
   	 Token existingToken = tokenDao.findByToken(token);
   	 if(existingToken != null) {
   		 tokenDao.delete(existingToken);
   	 }
		
	}

	public User getUserByToken(String token) throws Exception {
		Token existingToken = tokenDao.findByToken(token);
		if(existingToken == null) {
			throw new Exception("Not a valid token!");
		}

		return existingToken.getUser();
	}
}
