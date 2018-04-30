package com.java.mysystem.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * JDBC 操作的工具类
 * @author Slayer丨杰
 *
 */
public class JdbcUtils {
	
	/**
	 * 释放 Connection 对象
	 * @param conn
	 */
	public static void release(Connection conn){
		try {
			if(conn != null){
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static DataSource dataSource = null;
	static{
		//数据源只能被创建一次,所以要写在静态代码块里面
		dataSource = new ComboPooledDataSource("mysystemapp");
	}
	/**
	 * 返回数据源的一个 Connnection 对象
	 * @return
	 * @throws SQLException 
	 */
	public static Connection getConnecion() throws SQLException{
		return dataSource.getConnection();
	}
}
