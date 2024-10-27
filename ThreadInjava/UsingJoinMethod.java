package ThreadInjava;

public class UsingJoinMethod extends Thread {
    static Thread M;
    public void run() {
        try {
            M.join();
            for (int i=0; i<=5; i++) {
                System.out.println("Chila thread" + i);
                Thread.sleep(1000);
            }

        }
        catch (Exception e){
            System.out.println("Hello Huzaifa");
        }
    }
    public static void main(String[] args) {
        M=Thread.currentThread();
        UsingJoinMethod t=new UsingJoinMethod();
        t.start();

        try {
            for (int i=0; i<=5; i++){
                System.out.println("Main thread"+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println("Hello Huzaifa");
        }
    }

    }


