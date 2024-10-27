package ThreadInjava;
class TotalThings extends Thread{
    int totalchair=0;
    public void run(){
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                totalchair = totalchair + 100;
            }
            this.notify();
        }
    }
}
public class ThreadUsingWait {
    public static void main(String[] args) throws InterruptedException {
        TotalThings t=new TotalThings();
        t.start();
        synchronized (t) {
            t.wait();

            System.out.println(t.totalchair);
        }
    }
}
