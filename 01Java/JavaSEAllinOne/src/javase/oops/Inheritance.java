package javase.oops;

class Father
{
	static float money = 3_00_000f;
	int name;
	private int phone;//private members will not participated in inheritance
	
	void disp() {
		System.out.println(phone);
	}
}
class Son extends Father{
    static float money;
	
	static
    {
		money = Father.money;
	}

}


public class Inheritance {
	
	static int temp = 0;
	
	static void tempDisp() {
		System.out.println(temp);
	}

	public static void main(String[] args) {
		
//		Son s = new Son();
		System.out.println(Son.money);
		tempDisp();
		
		
		
	}

}

class Interest
{
	
}
class PersonalLoanInterest extends Interest
{
	
}

class Loan
{
	public Interest disp() {
		Interest it = new Interest();
		return it;
	}
	
}
class PersonalLoan extends Loan
{
	public PersonalLoanInterest disp() {
		PersonalLoanInterest pli = new PersonalLoanInterest();
		return pli;
	}
}

/**
 * single inheritance is possible
 * object class is the parent of all the classes.
 * multi level inheritance is allowed
 * hierarchial inheritance is possible.
 * = one parent and many children
 * hybrid inheritance is possible
 * multiple inheritance is not possible
 * cyclic inheritance is not possible
 * 
 * constructor will not participate in inheritance but however parent class constructor gets called due to super().
 * 
 * inheritance is the process of one class acquiring the properties of another class.
 * inheritance supports 

*/


