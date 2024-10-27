package ThreadInjava;
public class MainThread extends Thread {
    public void run(){
        System.out.println("Subhanllah");
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("10/2");;
       System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Huzaifa");
        System.out.println(Thread.currentThread().getName());
      //  System.out.println(10/0);
    }
}
