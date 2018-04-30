package com.java.mysystem.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * JDBC �����Ĺ�����
 * @author Slayerح��
 *
 */
public class JdbcUtils {
	
	/**
	 * �ͷ� Connection ����
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
		//����Դֻ�ܱ�����һ��,����Ҫд�ھ�̬���������
		dataSource = new ComboPooledDataSource("mysystemapp");
	}
	/**
	 * ��������Դ��һ�� Connnection ����
	 * @return
	 * @throws SQLException 
	 */
	public static Connection getConnecion() throws SQLException{
		return dataSource.getConnection();
	}
}
