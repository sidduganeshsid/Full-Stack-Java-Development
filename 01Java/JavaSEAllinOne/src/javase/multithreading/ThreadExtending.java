package javase.multithreading;

public class ThreadExtending {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		for(int i=0;i<1000;i++) {
			System.out.println("main thread");
		}
		
	}

}
class MyThread extends Thread
{
	public void loop1000x() {
		for(int i=0;i<1000;i++) {System.out.println("loop1000x() method");	}
}
}