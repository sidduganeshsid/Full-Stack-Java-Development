package javase.multithreading;

public class Sync{
    public static void main(String arg[]){
        Display d = new Display();
        MyThread2 t1 = new MyThread2(d,"sachin");
        MyThread2 t2 = new MyThread2(d,"dhoni");
        t1.start();
        t2.start();
    }
}
class MyThread2 extends Thread{

    Display d;
    String name;

    MyThread2(Display d, String name){
        this.d = d;
        this.name = name;
    }

    public void run(){
        d.wish(name);
    }
} 
class Display
{
    public synchronized void wish(String name){
        for(int i=1;i<=5;i++){
            System.out.print("Good Evening: ");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }
            System.out.println(name);
        }
    }
}