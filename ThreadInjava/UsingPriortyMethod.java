package ThreadInjava;

public class UsingPriortyMethod extends Thread{
    public void run(){
        System.out.println("Child thread");
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {

        System.out.println("Main Thread");
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(NORM_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());
        UsingPriortyMethod S=new UsingPriortyMethod();
        S.start();

    }
}
