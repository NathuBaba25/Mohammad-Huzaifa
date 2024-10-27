package ThreadInjava;

public class MtCase1 extends Thread
{
    public  void run(){
        System.out.println("Subhanallha");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MtCase1 s=new MtCase1();
        System.out.println(Thread.currentThread().getName());
        s.start();
        System.out.println(s.isAlive());
    }
}
