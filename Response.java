package com.clickit.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Response {
	private Object data;
	private String message;
	private HttpStatus status;
	
	public Response(Object data, String message, HttpStatus status) {
		super();
		this.data = data;
		this.message = message;
		this.status = status;
	}
	
	
	public Object getData() {
		return data;
	}


	public void setData(Object data) {
		this.data = data;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public HttpStatus getStatus() {
		return status;
	}


	public void setStatus(HttpStatus status) {
		this.status = status;
	}


	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ResponseEntity<Object> sendResponse(){
		return new ResponseEntity<Object>(this,this.status);
	}

}
