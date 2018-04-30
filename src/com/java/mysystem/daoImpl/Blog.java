package com.java.mysystem.daoImpl;

import java.util.List;

public class Blog {
	public Blog(int userId, String blogBody, String blogTittle) {
		super();
		this.userId = userId;
		this.blogBody = blogBody;
		this.blogTittle = blogTittle;
	}
	private int userId;
	private String blogBody;
	private String blogTittle;
	private int version;
	private String type;
	
	
	
	
	
	public Blog(int userId, String blogBody, String blogTittle, String type) {
		super();
		this.userId = userId;
		this.blogBody = blogBody;
		this.blogTittle = blogTittle;
		this.version = version;
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public Blog(int userId, String blogBody, String blogTittle, int version) {
		super();
		this.userId = userId;
		this.blogBody = blogBody;
		this.blogTittle = blogTittle;
		this.version = version;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getBlogBody() {
		return blogBody;
	}
	public void setBlogBody(String blogBody) {
		this.blogBody = blogBody;
	}
	public String getBlogTittle() {
		return blogTittle;
	}
	public void setBlogTittle(String blogTittle) {
		this.blogTittle = blogTittle;
	}
	
	@Override
	public String toString() {
		return "Blog [userId=" + userId + ", blogBody=" + blogBody + ", blogTittle=" + blogTittle + ", version="
				+ version + ", type=" + type + "]";
	}
	public Blog() {
		super();
	}
	
	
}
