package com.myblog.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.mysystem.dao.BlogDao;
import com.java.mysystem.daoImpl.BlogDaoImpl;

@WebServlet("/deleteMyArticle")
public class DeleteMyArticle extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String version = request.getParameter("version");
		BlogDao blogDao = new BlogDaoImpl();
		blogDao.deleteArticle(Integer.parseInt(version));
		response.getWriter().println("É¾³ý³É¹¦");
	}

}
