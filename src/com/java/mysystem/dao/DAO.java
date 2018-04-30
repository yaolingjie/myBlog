package com.java.mysystem.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.java.mysystem.db.JdbcUtils;

/**
 * 封装了基本的 CRUD 方法, 以供子类继承使用
 * 当前 DAO 直接在方法中获取数据库连接
 * 整个 DAO 采取DBUtils解决方案
 * @author Slayer丨杰
 * @param <T>: 当前 DAO 处理的实体类的类型是什么
 */
public class DAO<T> {
	private QueryRunner queryRunner = new QueryRunner();
	private Class<T> clazz;
	//构造器
	public DAO(){
		Type superClass = this.getClass().getGenericSuperclass();
		if(superClass instanceof ParameterizedType){
			ParameterizedType parameterizedType = (ParameterizedType)superClass;
			Type[] typeArgs = parameterizedType.getActualTypeArguments();
			if(typeArgs != null && typeArgs.length > 0){
				if(typeArgs[0] instanceof Class){
					clazz = (Class<T>)typeArgs[0];
				}
			}
		}
	}
	
	/**
	 * 返回某一个字段的值.
	 * @param sql: sql 语句
	 * @param args: 填充 sql 语句的占位符
	 * @return
	 */
	public <E> E getForValue(String sql, Object ... args){
		Connection conn = null;
		try {
			conn = JdbcUtils.getConnecion();
			return (E)queryRunner.query(conn, sql, new ScalarHandler(), args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 返回 T 所对应的 List
	 * @param sql: sql 语句
	 * @param args: 填充 sql 语句的占位符
	 * @return
	 */
	public List<T> getList(String sql, Object ... args){
		Connection conn = null;
		try {
			conn = JdbcUtils.getConnecion();
			return queryRunner.query(conn, sql, new BeanListHandler<>(clazz), args);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtils.release(conn);
		}
		return null;
	}
	
	/**
	 * 查询一条记录,返回 T 的一个实体类的一个对象
	 * @param sql: sql 语句
	 * @param args: 填充 sql 语句的占位符
	 * @return
	 */
	public T get(String sql, Object ... args){
		Connection conn = null;
		try {
			conn = JdbcUtils.getConnecion();
			return queryRunner.query(conn, sql, new BeanHandler<>(clazz), args);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JdbcUtils.release(conn);
		}
		return null;
	}
	
	/**
	 * 该方法封装了 delete, update, insert 方法
	 * @param sql: sql 语句
	 * @param args: 填充 sql 语句的占位符
	 */
	public void update(String sql, Object ... args){
		Connection conn = null;
		try {
			conn = JdbcUtils.getConnecion();
			queryRunner.update(conn, sql, args);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JdbcUtils.release(conn);
		}
	}
}
