package com.trial;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LaunchMain {
	public static void main(String[] args) {
        // Example usage
        LocalDate startDate = LocalDate.of(2001, 9, 9);
        LocalDate endDate = LocalDate.now();
        printDaysBetween(startDate, endDate);
    }

    public static void printDaysBetween(LocalDate startDate, LocalDate endDate) {
        if (startDate != null && endDate != null && !endDate.isBefore(startDate)) {
            long daysBetween = java.time.temporal.ChronoUnit.DAYS.between(startDate, endDate);
            System.out.println("Number of days: " + daysBetween);

            LocalDate currentDate = startDate;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            while (!currentDate.isAfter(endDate)) {
                System.out.println(currentDate.atStartOfDay().format(formatter));
                currentDate = currentDate.plusDays(1);
            }
        } else {
            System.out.println("Invalid date range");
        }
    }
}
