package com.myblog.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.mysystem.dao.UserDao;
import com.java.mysystem.daoImpl.UserDaoImpl;
import com.java.mysystem.domain.User;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		String result;
		User user = new User(userName, userPassword);
		UserDao userDao = new UserDaoImpl();
		User dataUser = userDao.selectUser(user);
		int userId = userDao.selectId(user);
		String blogName = userDao.getBlogName(userId);
		try{
			request.getSession().setAttribute("userName", dataUser.getUserName());
			request.getSession().setAttribute("userPassword", dataUser.getUserPassword());			
			request.getSession().setAttribute("blogName", blogName);
		}catch(Exception e){
			System.out.println("û������˺�����");
		}
		System.out.println(dataUser);
		request.getSession().setAttribute("flag", dataUser);
		if(dataUser == null){
			result="�û������������";
			response.setContentType("text/html; charset=utf-8");
			response.getWriter().print(result);
		} else{
			result="�û���������ȷ";
			response.setContentType("text/html; charset=utf-8");
			response.getWriter().print(result);
		}

	}

}
