package com.java.mysystem.daoImpl;

import java.util.List;

import com.java.mysystem.dao.CommentDao;
import com.java.mysystem.dao.DAO;
import com.java.mysystem.domain.Comment;

public class CommentDaoImpl extends DAO<Comment> implements CommentDao {

	@Override
	public List<Comment> getComment(int blogId) {
		String sql = "SELECT * FROM comment WHERE blogId = ?";
		return getList(sql, blogId);
	}

}
