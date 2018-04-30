package com.myblog.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.mysystem.dao.BlogDao;
import com.java.mysystem.dao.UserDao;
import com.java.mysystem.daoImpl.Blog;
import com.java.mysystem.daoImpl.BlogDaoImpl;
import com.java.mysystem.daoImpl.UserDaoImpl;
import com.java.mysystem.domain.User;

public class Writer extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String page = request.getParameter("page");
		page = page.replaceAll("\r", "/r");
		System.out.println(page);
		String type = request.getParameter("type");
		String userName = (String)request.getSession().getAttribute("userName");
		User user = new User(userName);
		UserDao userDao = new UserDaoImpl();
		BlogDao blogDao = new BlogDaoImpl();
		int id = userDao.selectId(user);
		Blog blog = new Blog(id, page, title, type);
		blogDao.insertBlog(blog);
		response.setContentType("text/html;charset=utf-8");
		System.out.println(123);
		response.sendRedirect("${request.contextPath}/../index");
		return;
	}
}
