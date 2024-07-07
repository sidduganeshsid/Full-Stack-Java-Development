package javase.exceptionhandling;

import java.util.Scanner;

public class LaunchExcep1 {

	public static void main(String[] args) {
		Alpha a = new Alpha();
		a.aplha();
		
	}

}
class Alpha
{
	void aplha() {
		System.out.println("Calculator");
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int x = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int y = sc.nextInt();
		
		int z = x/y;
		
		System.out.println("the division of x/y is : "+z);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Beta
{
	void beta() {
		Alpha a = new Alpha();
	}
}