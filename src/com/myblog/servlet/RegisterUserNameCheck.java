package com.myblog.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.mysystem.dao.UserDao;
import com.java.mysystem.daoImpl.UserDaoImpl;
import com.java.mysystem.domain.User;

public class RegisterUserNameCheck extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String registerUserName = (String)request.getParameter("registerUserName");
		System.out.println("registerUserName" + registerUserName);
		String result;
		UserDao userDao = new UserDaoImpl();
		User user = new User(registerUserName, null);
		User finalUser = userDao.getUser(user);
		if(finalUser != null){
			result = "<font color='red'>用户名已经存在</font>";
			System.out.println("用户名已经存在");
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().print(result);
		} else{
			result = "<font color='green'>用户名可用</font>";
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().print(result);
		}
	}
}
