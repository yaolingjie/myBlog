package com.java.mysystem.daoImpl;

import java.util.List;

import com.java.mysystem.dao.BlogDao;
import com.java.mysystem.dao.DAO;

public class BlogDaoImpl extends DAO<Blog> implements BlogDao{

	@Override
	public List<Blog> findBlogList(String type) {
		String sql ="SELECT * FROM blog WHERE type=?";
		return getList(sql, type);
	}
	@Override
	public void insertBlog(Blog blog){
		String sql = "INSERT INTO blog(user_id,blogBody,blogTittle,type) VALUES(?,?,?,?)";
		update(sql, blog.getUserId(), blog.getBlogBody(), blog.getBlogTittle(), blog.getType());
	}
	@Override
	public Blog selectBlogForVersion(int version) {
		String sql = "SELECT * FROM blog WHERE version = ?";
		return get(sql, version);
	}
	@Override
	public void commentBlog(int version, String user_Name, String comment) {
		String sql = "INSERT INTO comment VALUES(?,?,?)";
		update(sql, version, user_Name, comment);
	}
	@Override
	public List<Blog> searchTitle(String title) {
		String sql = "SELECT * FROM blog WHERE blogTittle=?";
		return getList(sql, title);
	}
	@Override
	public List<Blog> searchUserId(int userId) {
		String sql = "SELECT * FROM blog WHERE user_id=?";
		return getList(sql, userId);
	}
	@Override
	public void deleteArticle(int version) {
		String sql ="DELETE FROM blog WHERE version =?";
		update(sql, version);
	}
	

}
