package javase.oops;

import java.time.LocalDate;
import java.util.Date;

abstract class Person {
	
	public Person(String name, Integer age, Float height, Float weight, String d) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.d = d;
	}
	String name;
	Integer age;
	Float height;
	Float weight;
	String d;	
	
}
class Student1 extends Person{
	String sid;
	String courseName;
	Integer marks;
	
	Student1(String name, Integer age, Float height, Float weight, String d, String sid, String courseName,Integer marks)
	{
		super(name,age,height,weight,d);
		this.sid = sid;
		this.marks = marks;
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", courseName=" + courseName + ", marks=" + marks + ", name=" + name + ", age="
				+ age + ", height=" + height + ", weight=" + weight + ", d=" + d + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
public class AbstractPerson {


	public static void main(String[] args) {
		Student1 std1 = new Student1("sidduganesh",23,5.65f,48.0f,"2001-09-09","19TU1A0508","B.Tech",69);
		
		System.out.println(std1);
	}

}
