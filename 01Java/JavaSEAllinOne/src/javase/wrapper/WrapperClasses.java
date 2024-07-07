package javase.wrapper;

public class WrapperClasses {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(10);
		System.out.println("Integer(10) constructor : "+i1);
		
		Integer i2 = new Integer("10");
		System.out.println("Integer(\"10\") constructor "+i2);
		
		
		Float f1 = new Float(10.5f);
		System.out.println("Float(10.5f) construcor : "+f1);
		Float f2 = new Float("10.5f");
		System.out.println("Float(10.5f) construcor : "+f1);
		Float f3 = new Float(10.5f);
		System.out.println("Float(10.5f) construcor : "+f1);
		Float f4 = new Float(10.5f);
		System.out.println("Float(10.5f) construcor : "+f1);
		
		
		
		//utility methods
		Integer i4 = Integer.valueOf("100",2);
		System.out.println(i4);//decimal o/p :4
		
		
		Integer i = new Integer(130); //primitive to wrapper (not good practice use valueOf)
		Integer i5 = Integer.valueOf(1200);
		
		int i6 = i.intValue();System.out.println("wrapper obj to primitive "+i6);
		
		int i7 = Integer.parseInt("1000"); //string to primitive
		boolean b2 = Boolean.parseBoolean("sachin"); //false
		
		
		String s1 = Integer.toString(10);//primitive to string
		String s2 = String.valueOf(10);//primitive to string
		String s3 = String.valueOf(i);//wrapper to string
		System.out.println(s3);
		
		
		
	}

}
