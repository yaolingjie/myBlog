package com.myblog.test;

import java.math.BigDecimal;

import org.junit.Test;

import com.java.mysystem.dao.UserDao;
import com.java.mysystem.daoImpl.UserDaoImpl;
import com.java.mysystem.domain.LoginUser;
import com.java.mysystem.domain.User;

public class TestUserDao {
	@Test
	public void testAddUser(){
//		UserDao userDao = new UserDaoImpl();
//		BigDecimal phone = new BigDecimal("13266424270");
//		User user = new User("yyy", "123", "¹ã¶«ÉÇÍ·", phone, "ÄÐ");
//		userDao.addUser(user);
	}
	
	@Test
	public void testSelectUser(){
		UserDao userDao = new UserDaoImpl();
		String userName = "yyy";
		String userPassword = "123";
		User user = new User(userName, userPassword);
		User user2 = userDao.selectUser(user);
		
	}
}
