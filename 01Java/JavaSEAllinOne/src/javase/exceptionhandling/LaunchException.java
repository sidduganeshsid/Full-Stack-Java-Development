package javase.exceptionhandling;

import java.util.Scanner;

public class LaunchException 
{
	public static void main(String args[]) {
	System.out.println("Connection to Calculator application is established");
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first number to divide: ");
	int x = sc.nextInt();
	
	System.out.print("Enter the second number to divide: ");
	int y = sc.nextInt();
	
	int z = x/y;
	
	System.out.println("x/y is : "+z);

	
	}
}
