package com.sag.main;

import com.sag.cards.PaymentProcess;

public class Test {

	public static void main(String[] args) {
			PaymentProcess pp = new PaymentProcess();
			pp.doThePayment("creditcard", 10.0);
	}

}
