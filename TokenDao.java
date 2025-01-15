package com.clickit.dao;

import com.clickit.model.User;
import com.clickit.model.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenDao extends JpaRepository<Token, Integer> {

	public Token findByToken(String uuidAsString);

	public Token findByUser(User user);

}
