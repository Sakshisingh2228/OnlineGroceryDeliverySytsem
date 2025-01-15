package com.clickit.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String email;
	private String name;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String password;
	@CreationTimestamp
	private Date createdOn;
	private String contact;

	private String userType;
	
	
	public User() {
		super();
	}


	public User(Long userId, String email, String name, String password, Date createdOn, String contact, String userType) {
		this.userId = userId;
		this.email = email;
		this.name = name;
		this.password = password;
		this.createdOn = createdOn;
		this.contact = contact;
		this.userType = userType;
	}
	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Date getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}


	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", email='" + email + '\'' +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				", createdOn=" + createdOn +
				", contact='" + contact + '\'' +
				", userType='" + userType + '\'' +
				'}';
	}
}
