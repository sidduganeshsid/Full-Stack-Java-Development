package com.sag.main;

public class MainApplication {

	public static void main(String[] args) {
		TeluguTranslator t = new TeluguTranslator();
		HindiTranslator h = new HindiTranslator();
		
		t.helloInTelugu();
		h.helloInHindi();
		
	}

}
