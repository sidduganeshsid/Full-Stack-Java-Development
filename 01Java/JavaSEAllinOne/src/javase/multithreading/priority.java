package javase.multithreading;

public class priority {
    public static void main(String[] args) {
        ChildThread ct = new ChildThread();
        Thread t = new Thread(ct);
        t.start();
//        t.setPriority(10);

        for(int i=0;i<10;i++)
        { 
        	System.out.println("main thread "); 
        }

    }
}

class ChildThread implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++){ System.out.println("child thread "); }
    }
}