package com.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.util.JdbcUtil;

public class LaunchMainImage {

	public static void main(String[] args) {
		
		//resources
		Connection connection = null;
		PreparedStatement pstmt = null;
		
		String imgLocation = null; 
		
		//get the connection
		try {
			connection = JdbcUtil.getJdbcConnection();
			
			//create the req stmt
			String sqlInsertion = "INSERT INTO daily(`date`,`photos`) VALUES (?,?)";
			if(connection!=null) {
				pstmt = connection.prepareStatement(sqlInsertion);
			}
			
			if(pstmt!=null) {
				//inserting data
				java.util.Date uDate = new java.util.Date();
				long milliSeconds = uDate.getTime();
				Scanner sc = new Scanner(System.in);
				imgLocation = sc.next();
				java.sql.Date sqlDate = new java.sql.Date(milliSeconds);
				pstmt.setDate(1, sqlDate);
				pstmt.setBinaryStream(2, new FileInputStream(new File(imgLocation)));
				}
			
			//execute the query
			int rowCount = pstmt.executeUpdate();
			System.out.println("No: of rows affected : "+rowCount);
			
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		
	}

}
