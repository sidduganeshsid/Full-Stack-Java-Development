package javase.core;

public class TwoMainMethods {
	
	static class Nested
	{
		public static void main(String[] args) {
			System.out.println("Nested class main() called");
			System.out.println(args[0]);
		}
	}

	public static void main(String[] args) {
		System.out.println("main() called");
		Nested.main(new String[] {"hey"});
	}

}
