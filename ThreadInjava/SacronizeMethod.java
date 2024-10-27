package ThreadInjava;
class BookSeat{
 int total_Set=10;
 synchronized void book(int seats){
     if(total_Set>=seats){
         System.out.println("Toatal sets Sussfully :");
         total_Set=total_Set - seats;
         System.out.println("sets lef"+total_Set);
     }
     else {
         System.out.println("Sorry seat can,t book");

         System.out.println("Seat left:"+total_Set);
     }

 }
}
public class SacronizeMethod extends Thread{
 static    BookSeat b;
 int seats;
 public void run(){
     b.book(seats);

 }

    public static void main(String[] args) {
        b=new BookSeat();
        SacronizeMethod h=new SacronizeMethod();
        h.seats=5;
        h.start();
        SacronizeMethod b=new SacronizeMethod();
        b.seats=4;
        b.start();
    }
}
