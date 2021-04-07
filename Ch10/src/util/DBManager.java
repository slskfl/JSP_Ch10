package util;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBManager {
	
	//DB 접속을 위한 메서드(공통 모듈)
	public static Connection getConnection() {
		Connection conn=null;
		try {
			Context initContext=new InitialContext();
			Context envContext=(Context)initContext.lookup("java:/comp/env");
			DataSource ds=(DataSource)envContext.lookup("jdbc/myoracle");
			conn=ds.getConnection();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//select를 수행한 후 리소스 해제를 위한 메소드(Statement)
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//insert, update, delete를 수행한 후 리소스 해제를 위한 메서드(PreparedStatement)>>오버로딩을 사용하기
	public static void close(Connection conn, Statement stmt) {
		try {
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//select를 수행한 후 리소스 해제를 위한 메소드(PreparedStatement)
		public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
