package ThreadInjava;

import java.awt.*;

class A{
    int p_c=10;
  synchronized  void show(int Co){
        if(p_c>Co){
        System.out.println("total pen cost is:");
        p_c=p_c-Co;
        System.out.println("Saved total pen is: "+p_c);
    }
        else {
            System.out.println("Sacessful is Batter");
        }
    }
}
public class ThreadUse extends Thread {
   static A b;
   int Co;
    public void run(){

        b.show(Co);
    }
    public static void main(String[] args) {
        b=new A();
      ThreadUse s=new ThreadUse();
      s.Co=5;
      s.start();
      ThreadUse t=new ThreadUse();
      t.Co=5;
      t.start();
    }
}


