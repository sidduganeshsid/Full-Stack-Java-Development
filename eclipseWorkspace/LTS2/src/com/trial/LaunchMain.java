package com.trial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LaunchMain {

	    public static void main(String[] args) {
	        // Define the table names
//	        String[] tableNames = {"sg", "ag", "koki_table"};
	        
	     // Example usage
	        LocalDate startDate = LocalDate.of(2023, 8, 28);
	        LocalDate endDate = LocalDate.now();
	        printDaysBetween(startDate, endDate);

	        // Schedule the task to run daily at 00:00:00
//	        scheduleDailyInsertion(tableNames);
//	        System.out.println("code is running");
	        
	        
	    }

	    public static void scheduleDailyInsertion(String[] tableNames) {
	        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	        Runnable task = () -> {
	            for (String tableName : tableNames) {
	                insertCurrentDateIntoTable(tableName);
	            }
	        };

	        long initialDelay = computeInitialDelay();
	        long period = TimeUnit.DAYS.toMillis(1);

	        scheduler.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.MILLISECONDS);
	    }

	    public static long computeInitialDelay() {
	        LocalDateTime now = LocalDateTime.now();
	        LocalDateTime nextRun = now.truncatedTo(ChronoUnit.DAYS).plusDays(1);

	        return ChronoUnit.MILLIS.between(now, nextRun);
	    }

	    public static void insertCurrentDateIntoTable(String tableName) {
	        String jdbcURL = "jdbc:mysql://localhost:3306/lts";
	        String username = "root";
	        String password = "root";

	        LocalDate currentDate = LocalDate.now();

	        String insertSQL = "INSERT INTO " + tableName + " (date) VALUES (?)";

	        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password);
	             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {

	            preparedStatement.setDate(1, java.sql.Date.valueOf(currentDate));

	            int rowsInserted = preparedStatement.executeUpdate();

	            if (rowsInserted > 0) {
	                System.out.println("Successfully inserted today's date into table: " + tableName);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public static void printDaysBetween(LocalDate startDate, LocalDate endDate) {
//	    	public class DaysCalculator {
//
//	    	    public static void main(String[] args) {
//	    	        // Example usage
//	    	        LocalDate startDate = LocalDate.of(1990, 7, 4);
//	    	        LocalDate endDate = LocalDate.now();
//	    	        printDaysBetween(startDate, endDate);
//	    	    }
	    	 String jdbcURL = "jdbc:mysql://localhost:3306/lts";
		        String username = "root";
		        String password = "root";

//		        LocalDate currentDate = LocalDate.now();

		        String insertSQL = "INSERT INTO " + "om" + " (dates,selfiepic,fullpic) VALUES (?,null,null)";

//	    	    public static void printDaysBetween(LocalDate startDate, LocalDate endDate) {
	    	        if (startDate != null && endDate != null && !endDate.isBefore(startDate)) {
	    	            long daysBetween = java.time.temporal.ChronoUnit.DAYS.between(startDate, endDate);
	    	            System.out.println("Number of days: " + daysBetween);

	    	            LocalDate currentDate = startDate;
//	    	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	    	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	    	            while (!currentDate.isAfter(endDate)) {
	    	                System.out.println(currentDate.atStartOfDay().format(formatter));
	    	                
	    	               
	    	                
	    	                try (Connection connection = DriverManager.getConnection(jdbcURL, username, password);
	    	       	             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {

	    	       	            preparedStatement.setDate(1, java.sql.Date.valueOf(currentDate));

	    	       	            int rowsInserted = preparedStatement.executeUpdate();

	    	       	            if (rowsInserted > 0) {
	    	       	                System.out.println("Successfully inserted today's date into table: om ");
	    	       	            }
	    	       	        } catch (SQLException e) {
	    	       	            e.printStackTrace();
	    	       	        }
	    	                //update the date to next
	    	                currentDate = currentDate.plusDays(1);
	    	            }
	    	        } else {
	    	            System.out.println("Invalid date range");
	    	        }
	    	    }
//	    	}

	    }
	



//public static void main(String[] args) {
//	// Example usage
//	LocalDate startDate = LocalDate.of(2001, 9, 9);
//	LocalDate endDate = LocalDate.now();
//	printDaysBetween(startDate, endDate);
//}
//
//public static void printDaysBetween(LocalDate startDate, LocalDate endDate) {
//	if (startDate != null && endDate != null && !endDate.isBefore(startDate)) {
//		long daysBetween = java.time.temporal.ChronoUnit.DAYS.between(startDate, endDate);
//		System.out.println("Number of days: " + daysBetween);
//		
//		LocalDate currentDate = startDate;
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//		
//		while (!currentDate.isAfter(endDate)) {
//			System.out.println(currentDate.atStartOfDay().format(formatter));
//			currentDate = currentDate.plusDays(1);
//		}
//	} else {
//		System.out.println("Invalid date range");
//	}
//}