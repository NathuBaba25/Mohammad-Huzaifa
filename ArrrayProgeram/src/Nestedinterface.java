package ArrrayProgeram.src;

 interface Interface {
     void show();
     interface Massage{
         void masg();
     }
}
 public class Nestedinterface implements Interface.Massage{
   public void masg(){System.out.println("Hello Mohammad huzaifa");}

     public static void main(String[] args) {
         Interface.Massage massage=new Nestedinterface();
         massage.masg();

    }



 }
