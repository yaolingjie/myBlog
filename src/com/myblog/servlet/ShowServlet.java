package com.myblog.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.mysystem.dao.BlogDao;
import com.java.mysystem.dao.CommentDao;
import com.java.mysystem.daoImpl.Blog;
import com.java.mysystem.daoImpl.BlogDaoImpl;
import com.java.mysystem.daoImpl.CommentDaoImpl;

public class ShowServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str = request.getParameter("version");
		int version = Integer.parseInt(str);
		BlogDao blogDao = new BlogDaoImpl();
		Blog blog = blogDao.selectBlogForVersion(version);
		CommentDao commentDao = new CommentDaoImpl();
		List<com.java.mysystem.domain.Comment> commentList = commentDao.getComment(version);
		request.setAttribute("commentList", commentList);
		String blogBody = blog.getBlogBody();
		blogBody = blogBody.replaceAll("/r", "<br>");
		System.out.println("{--" + blogBody + "--}");
		blog.setBlogBody(blogBody);
		request.setAttribute("blog", blog);
		System.out.println(blog);
		System.out.println(commentList);
		request.getRequestDispatcher("/back_pic.jsp").forward(request, response);
	}
}
