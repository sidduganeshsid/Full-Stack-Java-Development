package com.sag.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
	
	private JdbcUtil() {}
	
	public static Connection getConnection() throws IOException, SQLException
	{
		FileInputStream fis = new FileInputStream(new File("application.properties"));
		Properties prop = new Properties();
		prop.load(fis);
		
		Connection connection = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"), prop.getProperty("password"));
		
		return connection;
	}

}
