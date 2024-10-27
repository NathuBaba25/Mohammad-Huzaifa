package ThreadInjava;

public class UsingMultipleThreadforsinleTask extends Thread{
    public void run(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        UsingMultipleThreadforsinleTask s=new  UsingMultipleThreadforsinleTask();
        s.start();
        UsingMultipleThreadforsinleTask t=new  UsingMultipleThreadforsinleTask();
        t.start();
    }
}
