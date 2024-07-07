package javase.oops;

public class Try {

	public static void main(String[] args) {

	}

}

class Human{
	//encapsulation
		private String name;
		private String age;
	static String planet = "Earth";
	
	//setters and getters
	public static String getPlanet() {
		return planet;
	}
	public static void setPlanet(String planet) {
		Human.planet = planet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	//inner classes
	class MaleBrain{}
	class Female{}
	
	//static inner class
	static class Kidney{}
}