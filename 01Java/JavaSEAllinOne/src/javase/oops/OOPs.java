package javase.oops;
/*
 * Encapsulation (providing controlled access to the data members) [private, setters and getters]
 * 
 * Inheritance (acquiring the properties and behaviour)(is-A, Has-A relationships) [extends]
 * 
 * Polymorphism (many forms)
 * 
 * Abstraction () [abstract , interface ]
 */

class Plane
{
	static final String ways = "air";
	String planeNo;
	String source;
	String destination;

	
	public void takeOff() { System.out.println("plane taking off"); }
	public void fly() { System.out.println("plane flying"); }
	public void landing() { System.out.println("plane landing"); }
}

class CargoPlane extends Plane
{
	//overridden method
	@Override
	public void fly() { System.out.println("cargo plane flies at LOWER HEIGHT"); }
	
	//specialized method
	public void carry() { System.out.println("cargo plane carries the GOODS"); }

}
class PassengerPlane extends Plane
{
	//overridden method
	@Override
	public void fly() { System.out.println("passenger plane flies at MEDIUM HEIGHT"); }
}

class Airport
{
	void permit(Plane plane) {
	plane.takeOff();
	plane.fly();
	plane.landing();
	}
}

public class OOPs {

	public static void main(String[] args) {
		
		CargoPlane cp  = new CargoPlane();
//		System.out.println(cp.planeNo);
//		cp.takeOff(); cp.fly(); cp.landing();
//		
//		System.out.println();
//		
		PassengerPlane pp  = new PassengerPlane();
//		System.out.println(pp.ways);
//		System.out.println(pp.planeNo);
//		pp.takeOff(); pp.fly(); pp.landing();
//		
//		System.out.println();
//		
//		Plane plane;
//		plane = cp;
//		plane.takeOff();
//		plane.fly();
//		plane.landing();
//		System.out.println();
//		plane = pp;
//		plane.takeOff();
//		plane.fly();
//		plane.landing();
		
		Airport ap = new Airport();
		ap.permit(cp);
		System.out.println();
		ap.permit(pp);
			
//		Plane p = new CargoPlane(); //upcasting or loose coupling to achieve polymorphism;
//		((CargoPlane) p).carry(); //downcasting to access specialized methods.
		
		
	}
}

//WRONG APPROACH's
class Car{}
class Engine extends Car{}

class Address{}
class Student extends Address{}

// CAR HAS-A ENGINE (correct)
//HAS-A relationship to establish "another class reference has to be the part of this class"
//the process of injecting dependent object in the target object is called as DEPENDENCY INJECTION.