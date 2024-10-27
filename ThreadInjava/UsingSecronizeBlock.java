package ThreadInjava;
class Pen{
    int total_Me=5;
void Total(int pay){
    synchronized(this){
        if(total_Me>pay){
            System.out.println("Total pane susesfully ");
            total_Me=total_Me-pay;
            System.out.println("After buy save pen"+total_Me);
        }
        else {
            System.out.println("Total pen is save");
            System.out.println("Toatal PEN IS SAVE"+total_Me);
        }
    }
}

}
public class UsingSecronizeBlock extends Thread{
   static Pen p;
   int pay;
   public void run(){
       p.Total(pay);
    }

    public static void main(String[] args) {
        p=new Pen();
        UsingSecronizeBlock b=new UsingSecronizeBlock();
        b.pay=5;
       b.start();
       UsingSecronizeBlock s=new UsingSecronizeBlock();
       s.pay=10;
       s.start();
    }

}
