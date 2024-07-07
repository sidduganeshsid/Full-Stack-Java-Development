package javase.runtimeerrors;
import java.util.Scanner;

//custom exception
class InvalidCustomerException extends Exception
{
	public InvalidCustomerException(String msg) {
		super(msg);
	}
}



class Atm
{
	//present in user db
	int userid = 1212;
	int password = 1111;
	
	//inputs from the user
	int pw;
	int uid;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kindly enter the user id: ");
		uid=scan.nextInt();
		System.out.println("Kindly enter the password: ");
		pw=scan.nextInt();
		
		
	}
	public void verify() throws InvalidCustomerException
	{
		if((userid == uid) && (password == pw)) {
			System.out.println("Take your cash");
		}
		else {
//			System.out.println("are you real owner of card ?");
			
			InvalidCustomerException ice = new InvalidCustomerException("retry");
//			System.out.println(ice.getMessage());
			throw ice;
		}
	}
}

class Bank
{
	public void initiate() {
		Atm a = new Atm();
		try {
			a.input();
			a.verify();
		} catch (InvalidCustomerException e) {
			try {
				a.input();
				a.verify();
			} catch (InvalidCustomerException e2) {
				try {
					a.input();
					a.verify();
				} catch (InvalidCustomerException e3) {
					System.out.println("Your Card is Block for the Day");
					System.exit(0);
				}
			}
		}
	}
}

public class CustomException {
	public static void main(String args[]) {
		Bank b = new Bank();
		b.initiate();
	}
}
