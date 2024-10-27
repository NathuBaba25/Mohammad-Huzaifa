package ThreadInjava;

 class Medical extends Thread {
    public void run() {
        try {
            System.out.println("Madical Chickkup");
            Thread.sleep(1000);
            System.out.println("Completed mEDICAL CHACKUP");
        } catch (Exception e) {
            System.out.println(" ");
        }
    }
}
public class JoinMetodExample  extends Thread{
    public void run(){
        try {

            System.out.println("Chack Drive");
            Thread.sleep(5000);
            System.out.println("completed Drive");
        }
        catch (Exception e){
            System.out.println(" ");
        }
    }

        public static void main(String[] args)throws InterruptedException {
            Medical s=new Medical();
            s.start();
            s.join();
            JoinMetodExample t=new JoinMetodExample();
            t.start();
        }

}
