package com.java.mysystem.dao;

import java.util.List;

import com.java.mysystem.daoImpl.Blog;

public interface BlogDao {

	public List<Blog> findBlogList(String type);
	void insertBlog(Blog blog);
	public Blog selectBlogForVersion(int version);
	public void commentBlog(int version, String userName, String comment);
	//��ѯ���в�ѯ�������±���
	public List<Blog> searchTitle(String title);
	//��ѯĳ���˵���������
	public List<Blog> searchUserId(int userId);
	//ɾ���˺��µ�ĳһƪ����
	public void deleteArticle(int version);
}
