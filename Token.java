package com.clickit.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
public class Token {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tokenId;
	private String token;
	@OneToOne
	private User user;

	@CreationTimestamp
	private Date createdOn;
	
	
	public Token() {
		super();
	}


	public Token(int tokenId, String token, User user, Date createdOn) {
		this.tokenId = tokenId;
		this.token = token;
		this.user = user;
		this.createdOn = createdOn;
	}


	public int getTokenId() {
		return tokenId;
	}


	public void setTokenId(int tokenId) {
		this.tokenId = tokenId;
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "Token{" +
				"tokenId=" + tokenId +
				", token='" + token + '\'' +
				", user=" + user +
				", createdOn=" + createdOn +
				'}';
	}
}
