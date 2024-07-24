package com.sag.beans;

public class CreditCard implements IPay {
	
	public CreditCard() {
		System.out.println("object for the class is created by IOC container");
	}
	@Override
	public boolean payBill(Double amt) {
		
		return false;
	}

}
