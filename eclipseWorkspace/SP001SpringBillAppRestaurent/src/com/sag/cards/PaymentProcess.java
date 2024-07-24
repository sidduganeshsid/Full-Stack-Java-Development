package com.sag.cards;

public class PaymentProcess {
	
	public boolean doThePayment(String cardType, Double billAmount) {
		if("creditcard".equalsIgnoreCase(cardType)) {
			//composition is used. (composition over inheritance)
			CreditCard cc = new CreditCard();
			return cc.payingBill(billAmount);
		}
		else if("debitcard".equalsIgnoreCase(cardType)) {
			DebitCard dc = new DebitCard();
			return dc.payingBill(billAmount);
		}
		else if("amexcard".equalsIgnoreCase(cardType)) {
			//cardType.equals("amexcard") //leads to null pointer 
			AmexCard ac = new AmexCard();
			return ac.payingBill(billAmount);
		}
		else {
			return false;
		}
	}

}
