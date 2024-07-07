package javase.multithreading;

public class Yeild {
    public static void main(String[] args) {
        ChildThread1 ct = new ChildThread1();
        Thread t = new Thread(ct);
        t.start();
        t.setPriority(1);

        for(int i=0;i<10;i++)
        { 
        	System.out.println("main thread "); 
        }

    }
}

class ChildThread1 implements Runnable
{
    public void run()
    {
    	Thread.yield();
        for(int i=0;i<10;i++){ System.out.println("child thread "); }
    }
}