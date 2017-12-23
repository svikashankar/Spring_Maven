package com.navi.spring.rest.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {
	private int userId;
	private String userName;
	private String emailId;

	public UserDTO() {
		System.out.println(this.getClass().getSimpleName() + " created");
	}

	public UserDTO(int userId, String userName, String emailId) {
		System.out.println(this.getClass().getSimpleName() + " created");
		// super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
