package javase.multithreading;

public class Sleep {

	public static void main(String[] args) throws InterruptedException {
//		System.out.print("S");
//		Thread.sleep(100);
//		System.out.print("i");
//		Thread.sleep(100);
//		System.out.print("d");
//		Thread.sleep(100);
//		System.out.print("d");
//		Thread.sleep(100);
//		System.out.print("u");
		
		String name = "siddu ganesh";
		for(int i=0;i<name.length();i++) {
			System.out.print(name.charAt(i));
			Thread.sleep(100);
		}
		
		
		
	}

}
