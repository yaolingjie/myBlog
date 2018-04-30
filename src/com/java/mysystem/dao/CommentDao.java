package com.java.mysystem.dao;

import java.util.List;

import com.java.mysystem.domain.Comment;

public interface CommentDao {
	public List<Comment> getComment(int blogId);
}
