package ThreadInjava;

public class YieldMethod extends Thread{
    public void run(){
        for(int i=0;i<=5; i++){
            System.out.println("Child Thread"+Thread.currentThread().getName()+" "+i);
        }
    }
    public static void main(String[] args) {
        YieldMethod s=new YieldMethod();
        s.start();
        Thread.yield();
        for(int i=0; i<=5; i++){
            System.out.println("Main Thread"+Thread.currentThread().getName()+""+i);
        }
    }
}
