package com.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.JdbcUtil;

public class LaunchImgRetrival {

	public static void main(String[] args) {
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		
		try {
			connection = JdbcUtil.getJdbcConnection();
			
			String sqlSelect = "SELECT * FROM photos WHERE ";
			if(connection!=null) {
				pstmt = connection.prepareStatement(sqlSelect);
			}
			if(pstmt!=null) {
				ResultSet rs = pstmt.executeQuery();
				
				
			}
			
			
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		
	}

}
