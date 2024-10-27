package ThreadInjava;

public class MultipeTaskfromMultiplethread extends Thread{
   public void run(){
        System.out.println("subhanallah");
    }
}
class thred1 extends Thread{
    public void run(){
        System.out.println("Alhumdulillah");
    }

    public static void main(String args[]) {
        MultipeTaskfromMultiplethread t=new MultipeTaskfromMultiplethread();
        t.start();
        thred1 p=new thred1();
       p.start();
    }
}
