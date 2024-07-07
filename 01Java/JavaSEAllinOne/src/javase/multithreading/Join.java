package javase.multithreading;

public class Join {
    public static void main(String[] args) throws InterruptedException {
        ChildThread2 ct = new ChildThread2();
        Thread t = new Thread(ct);
        t.start();

//        t.join();
//        t.join(1000);
        t.join(100,10);//main thread is waiting for child thread
        for(int i=0;i<10;i++)
        { 
        	System.out.println("sita thread "); 
        }

    }
}

class ChildThread2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++){ 
        	System.out.println("rama thread ");
        	try {
        		Thread.sleep(2000);
        	}catch(InterruptedException e) {
        		
        	}
        }
    }
}