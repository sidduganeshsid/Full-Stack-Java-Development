package com.sag.operations;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.sag.util.JdbcUtil;

public class LaunchSelect {
	
//	Connection connection = null;
//	
//	public static void selectOperation() {
//		try {
//			connection = JdbcUtil.getJdbcConnection();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	Connection connection = null;
	PreparedStatement pstmt = null;
	Scanner scanner = null;
	ResultSet resultSet = null;
	int sid = 0;

	public  void selectOperation() {
	try {
		connection = JdbcUtil.getJdbcConnection();

		String sqlSelectQuery = "select sid,sname,sdob,sgender,saddress from students where sid =?";
		if (connection != null)
			pstmt = connection.prepareStatement(sqlSelectQuery);

		if (pstmt != null) {

			scanner = new Scanner(System.in);

			System.out.print("Enter the id of the student :: ");
			sid = scanner.nextInt();

			// use precompiled query to set the values
			pstmt.setInt(1, sid);

			// execute the query
			resultSet = pstmt.executeQuery();
		}
		if (resultSet != null) {

			if (resultSet.next()) {
				System.out.println("ID\tNAME\t\tDOB\t\tGENDER\tADDRESS");
				System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getDate(3)
						+ "\t" + resultSet.getString(4) + "\t" + resultSet.getString(5));
			} else {
				System.out.println("Record not available for the give id :: " + sid);
			}
		}

	} catch (IOException ie) {
		ie.printStackTrace();
	} catch (SQLException se) {
		se.printStackTrace();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			JdbcUtil.cleanUp(connection, pstmt, resultSet);
			System.out.println("Closing the resource...");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
}



