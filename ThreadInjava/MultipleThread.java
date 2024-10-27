package ThreadInjava;

public class MultipleThread extends Thread{
    public void run(){

            try {
                for(int i=1;i<=5; i++)
                    System.out.println(i+"    "+ Thread.currentThread().getName());
                    Thread.sleep(10000);

            }
          catch (Exception e){
              System.out.println(e);
          }
    }
    public static void main(String[] args) {
        MultipleThread s=new MultipleThread();
        s.run();
        MultipleThread s1=new MultipleThread();
        s1.run();
    }
}
