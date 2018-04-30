package com.java.mysystem.dao;

import java.util.List;

import com.java.mysystem.daoImpl.Blog;

public interface BlogDao {

	public List<Blog> findBlogList(String type);
	void insertBlog(Blog blog);
	public Blog selectBlogForVersion(int version);
	public void commentBlog(int version, String userName, String comment);
	//查询框中查询博客文章标题
	public List<Blog> searchTitle(String title);
	//查询某个人的所有文章
	public List<Blog> searchUserId(int userId);
	//删除账号下的某一篇文章
	public void deleteArticle(int version);
}
