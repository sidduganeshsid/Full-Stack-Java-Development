package com.sag.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
	
	private JdbcUtil(){}
	
	public static Connection getJdbcConnection() throws SQLException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\siddu\\OneDrive\\Desktop\\Skills\\FSJDev\\eclipseWorkspace\\JDBC-CRUD-Console Based Application\\src\\application.properties");
		Properties properties = new Properties();
		properties.load(fis);
		
		Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("password"));
		
		return connection;
	}
	
	public static void cleanUp(Connection con, PreparedStatement pstatement, ResultSet resultSet) throws SQLException {
		// Step6. Close the resources
		if (con != null) {
			con.close();
		}
		if (pstatement != null) {
			pstatement.close();
		}
		if (resultSet != null) {
			resultSet.close();
		}
	}
	

}
