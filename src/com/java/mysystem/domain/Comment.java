package com.java.mysystem.domain;

public class Comment {
	private int blogId;
	private String userName;
	private String comment;
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Comment(int blogId, String userName, String comment) {
		super();
		this.blogId = blogId;
		this.userName = userName;
		this.comment = comment;
	}
	public Comment() {
		super();
	}
	@Override
	public String toString() {
		return "Comment [blogId=" + blogId + ", userName=" + userName + ", comment=" + comment + "]";
	}
	
}
