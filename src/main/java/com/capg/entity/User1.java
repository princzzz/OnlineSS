package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User1 {

	@Id
	private String userId;
	private String password;
	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User1(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User1 [userId=" + userId + ", password=" + password + "]";
	}
	
	
}
