package com.sag.main;

import java.util.Scanner;

import com.sag.operations.LaunchSelect;



public class LaunchMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Option to choose the operation to perform : ");
		int option = sc.nextInt();
		
		switch(option) {
		case 1 : System.out.println("Insert");;break;
		case 2 : System.out.println("Select");LaunchSelect ls = new LaunchSelect();ls.selectOperation();;break;
		case 3 : System.out.println("Update");;break;
		case 4 : System.out.println("Delete");;break;
		case 5 : System.exit(0);;break;
		
		default : System.out.println("Invalid Option choosen...");;break;
		}
		
	}

}
