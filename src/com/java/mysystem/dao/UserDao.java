package com.java.mysystem.dao;

import com.java.mysystem.daoImpl.Blog;
import com.java.mysystem.domain.User;

public interface UserDao {
	public User selectUser(User user);
	public void addUser(User user);
	public User getUser(User user);
	int selectId(User user);
	String getBlogName(int userId);
	long findPassword(User user);
	void updateUser(User user);
	//通过博客名获取使用者id
	int getUserId(String blogName);
}
