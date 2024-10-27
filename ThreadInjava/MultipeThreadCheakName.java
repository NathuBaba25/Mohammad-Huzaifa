package ThreadInjava;

public class MultipeThreadCheakName  extends Thread{
    public void run(){
        System.out.println("Mohammad Huzaifa");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("HELLO");
        MultipeThreadCheakName s1=new  MultipeThreadCheakName();
        s1.start();
        System.out.println(Thread.currentThread().getName());
        MultipeThreadCheakName t1=new MultipeThreadCheakName();
        t1.start();

    }
}
