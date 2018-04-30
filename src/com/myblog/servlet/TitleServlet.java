package com.myblog.servlet;

import java.io.IOException;
import java.util.List;

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
import com.java.mysystem.service.BlogService;

public class TitleServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = (String)req.getSession().getAttribute("userName");
		System.out.println("hei!" + userName);
		UserDao userDao = new UserDaoImpl();
		User user = new User(userName);
		int userId = userDao.selectId(user);
		BlogDao blogDao = new BlogDaoImpl();
		List<Blog> myArticles = blogDao.searchUserId(userId);
		
		BlogService service = new BlogService();
		List<Blog> list = service.findBlog("Java");
		List<Blog> listOracle = service.findBlog("Oracle");
		List<Blog> listJS = service.findBlog("JavaScript");
		List<Blog> listAjax = service.findBlog("Ajax");
		List<Blog> listjQuery = service.findBlog("jQuery");
		List<Blog> listSpring = service.findBlog("Spring");
		List<Blog> listMybatis = service.findBlog("Mybatis");
		
		req.setAttribute("myArticles", myArticles);
		req.setAttribute("listJava", list);
		req.setAttribute("listOracle", listOracle);
		req.setAttribute("listJS", listJS);
		req.setAttribute("listAjax", listAjax);
		req.setAttribute("listjQuery", listjQuery);
		req.setAttribute("listSpring", listSpring);
		req.setAttribute("listMybatis", listMybatis);
		req.getRequestDispatcher("Blogger.jsp").forward(req, resp);
	}
}
