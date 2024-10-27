package ThreadInjava;

public class IntreptedException extends Thread {
    public void run(){

try {
    for (int i = 0; i <= 10; i++) {
        Thread.sleep(2000);
        System.out.println(i);
    }
    String s = null;
    System.out.println(s.length());

}
catch (NullPointerException | InterruptedException e){
    System.out.println("Sueccful yor progeram");


        }
    }

    public void main(String[] args) {
        IntreptedException s = new IntreptedException();
        s.start();
    }
}
