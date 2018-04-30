package com.myblog.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.mysystem.dao.BlogDao;
import com.java.mysystem.dao.UserDao;
import com.java.mysystem.daoImpl.Blog;
import com.java.mysystem.daoImpl.BlogDaoImpl;
import com.java.mysystem.daoImpl.UserDaoImpl;

public class SearchServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String search = request.getParameter("search");
		search = search.trim();
		System.out.println("search : " + search);
		BlogDao blogDao = new BlogDaoImpl();
		//查询blog标题
		List<Blog> blog = blogDao.searchTitle(search);
		
		System.out.println(blog);
		//查询blog名
		UserDao userDao = new UserDaoImpl();
		int i = 0;
		try {
			i = userDao.getUserId(search);
		} catch (Exception e) {
		}finally{
			System.out.println(i);	
			List<Blog> blog2 = new ArrayList<>();
			if(i != 0){
				blog2 = blogDao.searchUserId(i);
			}
			blog2.addAll(blog);
			System.out.println("blog2" + blog2);
			HttpSession session = request.getSession();
			session.removeAttribute("blogTitle");
			session.setAttribute("blogTitle", blog2);
			if(blog2.equals(new ArrayList())){
				response.getWriter().println(false);
			}
		}
	}
}
