package ThreadInjava;

public class PerformingSingleTask1Thread  extends Thread{
    public void run(){
        System.out.println("Hello Huzaifa");
    }

    public static void main(String[] args) {
        PerformingSingleTask1Thread s=new PerformingSingleTask1Thread();
        s.start();
    }

}
