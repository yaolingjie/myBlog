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
 * ��װ�˻����� CRUD ����, �Թ�����̳�ʹ��
 * ��ǰ DAO ֱ���ڷ����л�ȡ���ݿ�����
 * ���� DAO ��ȡDBUtils�������
 * @author Slayerح��
 * @param <T>: ��ǰ DAO �����ʵ�����������ʲô
 */
public class DAO<T> {
	private QueryRunner queryRunner = new QueryRunner();
	private Class<T> clazz;
	//������
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
	 * ����ĳһ���ֶε�ֵ.
	 * @param sql: sql ���
	 * @param args: ��� sql ����ռλ��
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
	 * ���� T ����Ӧ�� List
	 * @param sql: sql ���
	 * @param args: ��� sql ����ռλ��
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
	 * ��ѯһ����¼,���� T ��һ��ʵ�����һ������
	 * @param sql: sql ���
	 * @param args: ��� sql ����ռλ��
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
	 * �÷�����װ�� delete, update, insert ����
	 * @param sql: sql ���
	 * @param args: ��� sql ����ռλ��
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
