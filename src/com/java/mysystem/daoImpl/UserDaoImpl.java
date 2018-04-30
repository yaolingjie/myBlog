package com.java.mysystem.daoImpl;

import com.java.mysystem.dao.DAO;
import com.java.mysystem.dao.UserDao;
import com.java.mysystem.domain.User;

public class UserDaoImpl extends DAO<User> implements UserDao {
	
	@Override
	public int selectId(User user){
		String sql = "SELECT userId FROM user_login WHERE userName=?";
		if(getForValue(sql, user.getUserName()) == null){
			return 0;
		}
		return getForValue(sql, user.getUserName());
	}
	@Override
	public User selectUser(User user) {
		String sql = "SELECT * FROM user_login WHERE userName=? AND userPassword=?";
		return get(sql, user.getUserName(), user.getUserPassword());
	}
	@Override
	public void addUser(User user) {
		String sql1 = "INSERT INTO user_message(phone,address,sex,blog)VALUES(?,?,?,?)";
		String sql2 = "INSERT INTO user_login(userName,userPassword)VALUES(?,?)";
		update(sql2, user.getUserName(), user.getUserPassword());
		update(sql1, user.getPhone(), user.getAddress(), user.getSex(), user.getBlog());
	}
	public User getUser(User user){
		String sql = "SELECT * FROM user_login WHERE userName = ?";
		return get(sql, user.getUserName());
	}
	@Override
	public String getBlogName(int userId) {
		String sql = "SELECT blog FROM user_message WHERE user_id=?";
		return getForValue(sql, userId);
	}
	@Override
	public long findPassword(User user) {
		String sql = "SELECT count(*) FROM user_login LEFT JOIN user_message on userId = user_id Where userName=? AND phone=?";
		return getForValue(sql, user.getUserName(), user.getPhone());
	}
	@Override
	public void updateUser(User user) {
		String sql = "UPDATE user_login SET userPassword=? WHERE userName=?";
		update(sql, user.getUserPassword(), user.getUserName());
	}
	@Override
	public int getUserId(String blogName) {
		String sql = "SELECT user_id FROM user_message WHERE blog=?";
		return getForValue(sql, blogName);
	}

}
