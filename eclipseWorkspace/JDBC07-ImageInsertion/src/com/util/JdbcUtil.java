package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {

	private JdbcUtil() {}
	
	public static Connection getJdbcConnection() throws SQLException, IOException {
		
		FileInputStream fis = new FileInputStream("src\\com\\properties\\application.properties");
		Properties properties = new Properties();
		properties.load(fis);
		
		Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("password"));
		
		return connection;
	}
	
	public static void cleanUp(Connection con,PreparedStatement pstmt,ResultSet rs) throws SQLException {
		
		if(con!=null) {
			con.close();
		}
		if(pstmt!=null) {
			pstmt.close();
		}
		if(rs!=null) {
			rs.close();
		}
		
	}
}