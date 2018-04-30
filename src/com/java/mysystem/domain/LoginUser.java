package com.java.mysystem.domain;

public class LoginUser {
	private int id;
	private String userName;
	private String userPassword;
	public LoginUser(int id, String userName, String userPassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	public LoginUser(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}
	public LoginUser() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "LoginUser [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	
}
