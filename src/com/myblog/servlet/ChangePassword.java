package com.myblog.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.mysystem.dao.UserDao;
import com.java.mysystem.daoImpl.UserDaoImpl;
import com.java.mysystem.domain.User;


public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println(userName + " : " + password);
		System.out.println("进入ChangePasswordServlet中");
		User user = new User(userName, password);
		UserDao userDao = new UserDaoImpl();
		userDao.updateUser(user);
		System.out.println(user);
		response.getWriter().println("<script>alert('修改密码成功');</script>");
		response.getWriter().println("<a href=\"index\">点击我返回登录</a>");		
		
	}
}
