package ThreadInjava;

 public class InteraptedMethod extends Thread{
    public void run(){
      // System.out.println(Thread.currentThread().isInterrupted());
       // System.out.println(Thread.currentThread().isInterrupted());
        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());
        try {
            for(int i=1; i<=5; i++){
                System.out.println(i);
                Thread.sleep(1000);
              //  System.out.println(Thread.interrupted());
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        InteraptedMethod s=new InteraptedMethod();
        s.start();
        s.interrupt();
    }
}
