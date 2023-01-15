package com.masai.erp.entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class User {

	private int uId;
	private String username;
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role;
}
