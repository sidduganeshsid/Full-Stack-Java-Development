package com.sag.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sag.util.JdbcUtil;

public class Test {

	public static void main(String[] args) {
		
		Connection connection =  null;
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;
		
		try {
			connection = JdbcUtil.getConnection();
			
			String sqlQuery = "select * from account";
			if(connection!=null) {
				pstmt = connection.prepareStatement(sqlQuery);
			}
			
			if(pstmt!=null) {
				resultSet = pstmt.executeQuery();
			}
			
			while(resultSet.next()) {
				Integer id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				Integer amount = resultSet.getInt(3);
				
				System.out.println("id\tname\tamount");
				System.out.println(id+"\t"+name+"\t"+amount);
			}
			
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
