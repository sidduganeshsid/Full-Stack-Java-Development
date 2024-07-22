package com.sag.tools;

public class Calculator {
	
	static {
		System.out.println("Calculator.class is loaded");
	}
	public Calculator() {
		System.out.println("Calculator object is instatiated.");
	}
	
	public int square(int num) {
		return num*num;
	}

}
