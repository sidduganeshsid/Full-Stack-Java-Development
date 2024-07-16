package com.sag.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtil {
	
	private JdbcUtil() {}
	
	public static Connection getConnection() throws IOException, SQLException
	{
		FileInputStream fis = new FileInputStream(new File("src\\com\\sag\\properties\\application.properties"));
		Properties prop = new Properties();
		prop.load(fis);
		
		Connection connection = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"), prop.getProperty("password"));
		
		return connection;
	}
	
	public static void cleanUp(Connection con,Statement stmt,ResultSet res) {
		if(con!=null) {
			try {
				
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(res!=null) {
			try {
				res.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		}

}
