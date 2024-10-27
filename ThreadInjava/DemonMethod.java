package ThreadInjava;

public class DemonMethod  extends  Thread{
    public void run(){

        if(Thread.currentThread().isDaemon()){
            System.out.println("Demon thread");
        }
        else
         System.out.println("Childdf Thread");
    }

    public static void main(String[] args) {
        System.out.println("Bye Ali");
        DemonMethod s=new DemonMethod();
       // s.setDaemon(true);
        s.start();
    }
}
