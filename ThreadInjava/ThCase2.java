package ThreadInjava;

public class ThCase2 implements Runnable{
    public void run() {
        System.out.println("Barakallah");
    }

    public static void main(String[] args) {
        ThCase2 t = new ThCase2();
        Thread s = new Thread(t);
        s.start();
    }
}

