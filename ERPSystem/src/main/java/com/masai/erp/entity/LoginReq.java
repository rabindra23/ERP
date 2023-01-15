package com.masai.erp.entity;

public class LoginReq {

	private String username;
	private String password;
	
	public LoginReq() {}

	public LoginReq(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String username() {
		return username;
	}

	public void setMobileNumber(String mobileNumber) {
		this.username = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
