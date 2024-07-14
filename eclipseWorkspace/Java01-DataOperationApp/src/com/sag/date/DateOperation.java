package com.sag.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateOperation {

	public static void main(String[] args) throws ParseException {
		
		//java.util.Date = > it is used to store the both date and time information.
		Date udate = new java.util.Date();
		System.out.println("Util Date is :: "+udate);
		
		
		//date to keep at the database side 
		long msDate = udate.getTime();
		System.out.println("Information about data in milliseconds :: "+msDate);
		Date sdate = new java.sql.Date(msDate);//sql date stores only date information
		System.out.println("sql date :: "+sdate);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the DOB of the Student (dd-MM-yyyy): ");//don't write the small mm
		String strDOB = sc.next();
		System.out.println("string dob :: "+strDOB);
		
		//convert from string to util.Date
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");//don't write the small mm or cap YYYY//it is case sensitive
		java.util.Date uDOB = sdf.parse(strDOB);
		System.out.println("DOB in util Date :: "+uDOB);

		
		//convert util.Date to sql.Date
		long uDOBInMS = uDOB.getTime();
		
		java.sql.Date sqlDOB = new java.sql.Date(uDOBInMS);
		System.out.println("DOB in sql Date :: "+sqlDOB);
		
		sc.close();
	}

}
