package ThreadInjava.TNTRP;

public class ExInMain extends Thread{
    public static void main(String[] args) {

        for (int i=0; i<=5; i++){
            try {
                Thread.sleep(5000);
                System.out.println(i);
            }
            catch (InterruptedException e){
               System.out.println("hello");
            }
        }

    }
}
