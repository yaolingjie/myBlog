package com.myblog.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.mysystem.dao.BlogDao;
import com.java.mysystem.dao.UserDao;
import com.java.mysystem.daoImpl.BlogDaoImpl;
import com.java.mysystem.daoImpl.UserDaoImpl;
import com.java.mysystem.domain.User;

public class Comment extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String comment = request.getParameter("comment");
		String str1 = request.getParameter("version");
		int version  = Integer.parseInt(str1);
		String userName = (String)request.getSession().getAttribute("userName");
		User user = new User(userName);
		UserDao userDao = new UserDaoImpl();
		int userId = userDao.selectId(user);
		String blogName = userDao.getBlogName(userId);
		BlogDao blogDao = new BlogDaoImpl();
		blogDao.commentBlog(version, blogName, comment);
		response.sendRedirect(request.getContextPath() + "/show?version=" + str1);
	}
}
