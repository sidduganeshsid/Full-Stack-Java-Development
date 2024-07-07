package javase.core;

public class snippet1 {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("ten");
		}catch(NullPointerException ne) {
//			System.out.println(i);
			System.out.println("snippet1.main()");
		}
	}

}
