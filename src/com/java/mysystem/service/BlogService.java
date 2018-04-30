package com.java.mysystem.service;

import java.util.List;

import com.java.mysystem.dao.BlogDao;
import com.java.mysystem.daoImpl.Blog;
import com.java.mysystem.daoImpl.BlogDaoImpl;

public class BlogService {
	BlogDao dao = new BlogDaoImpl();
	public List<Blog> findBlog(String type) {
		return dao.findBlogList(type);
	}


}
