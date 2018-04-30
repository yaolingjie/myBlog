package com.java.mysystem.domain;

import java.math.BigDecimal;

public class User {
	private Integer id;		//用户Id
	private String userName;	//用户名
	private String userPassword;		//密码
	private String address;		//地址
	private BigDecimal phone;			//手机号码
	private String sex;		//性别
	private String blog;	//博客名
	
	public User(String userName){
		this.userName = userName;
	}
	
	public User(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public User(String userName, String userPassword, String address, BigDecimal phone, String sex, String blog) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.address = address;
		this.phone = phone;
		this.sex = sex;
		this.blog = blog;
	}

	public User() {
		super();
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getPhone() {
		return phone;
	}

	public void setPhone(BigDecimal phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + ", address=" + address
				+ ", phone=" + phone + ", sex=" + sex + "]";
	}

	
}
