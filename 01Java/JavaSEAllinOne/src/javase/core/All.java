
/**CONCEPTS OF JAVA PROGRAMMING LANGUAGE
[ OPERATORS, CONDITIONALS & LOOPS ]

[ methods ]

[ ARRAYS, STRINGS] In Java, arrays and strings are treated as objects.

[ OOP’s ]

Encapsulation  

- encapsulation promotes privacy or security (data hiding) and (data binding)
- provides the controlled access to the data members.

Inheritance       

- inheritance promotes the code reusability.

Polymorphism 

- polymorphism promotes the code flexibility.

Abstraction       

- abstraction makes implementations hiding and provides features visibility

[ EXCEPTION HANDLING, MULTI THREADING, FILE HANDLING ]

[ COLLECTION FW ]

[ FUNCTIONAL PROGRAMMING ] [stream API]
*/
package javase.core;

enum ExamResult
{
	PASS(1),FAIL(0),ABSENT(-1),PENDING;
	int results;
	ExamResult(int results){
		this.results = results;
	}
	ExamResult(){
		waiting();
	}
	String waiting() {
		return "results are waiting";
	}
	
}

class Trail
{
//	int a=10,b=20;
	public int pub=10;
	protected int pro=11;
	private int pri=12;
	int def=13;//instance variable
	
	static int count=0; //to count number of objects
	
	{
		count++;
	}
	
	static int staDef = 20;//static variable
	static {
		staDef=21;//static block
	}
	static void staDisp() {//static method.
		System.out.println(staDef);
	}
	
	{//java block //instance block
		def = 24;
	}
	
	void instDisp() {
		System.out.println(def);
	}
	
	static void nfObjects() {
		System.out.println(count);
	}
	
	public Trail(){
		//constructor includes the java block at first.
		System.out.println("Trail constructor");}
	//1.static variables gets assigned when class is loaded.
	//2.static block gets executed.
	//3.static methods gets executed.
	//4.memory for instance variables.
	//6.java block 
	//7.constructor gets executed.
	//8.instance methods gets called.
	
	
}

class Test
{
	int a,b,c; 
	
	//task will be brought into stack area for execution.
	//noInput & noReturning
//	void add()
//	{
//		a=1;
//		b=2;
//		c=a+b;
//		System.out.println(c);
//	}
	
	//inputNoReturning
	void add(int a,int b)//parameters
	{
		int res = a+b;
		System.out.println(res);
	}
	
	//inputReturn
	float add(float a,float b) {
		return a+b;
	}
	
	//noInputButReturns
	int add() {
		return 0;
	}
}

public class All {

	public static void main(String[] args) {
		System.out.println("main() method is called");
		Test t = new Test();
		t.add();
		t.add(10,30);//arguments
		float addedValue = t.add(23.2f,12.2f);
		
		byte b = 1;
		short s = 2;
		int i = 4;
		long l = 8l;
		float f = 4f;
		double d = 8;
		char c = 'a';
		boolean bo = false;
		
//		System.out.println(s1); //not accessible
		String s1 = "HELLO";
		String s2 = "Hello"; 
		String s3 = "Hello"; System.out.println(s2==s3);//compares references 
		System.out.println(s2.equals(s3)); //compares content
		String s4 = new String("Hello");
		String s5 = new String("hello");
		
		String s6 = "Hello";
		s6.concat(" World!"); System.out.println(s6);
		
		StringBuilder s7 = new StringBuilder("Hello");
		StringBuilder s8 = new StringBuilder("Hello");
		System.out.println(s7==s8);//compares references 
		System.out.println(s7.equals(s8)); //compares content //bcz stringBuilder class not overridden the equals from object.
		s7.append(" World!"); System.out.println(s7);
		
		Trail tr = null;
		for(int iii=0;iii<5;iii++) {
		tr = new Trail();
		System.out.println(tr);
		}
		System.out.println(tr);

		
		Trail.staDisp();
		
		Trail.nfObjects();
		

	}

}
