package ArrrayProgeram.src;

 class A{
     interface Massage{
         void msg();
     }
}
public class Interfacewhichisdeclaredwithinclass implements A.Massage{
     public void msg(){System.out.println("Hello bye");}

    public static void main(String[] args) {
        A.Massage massage=new Interfacewhichisdeclaredwithinclass();
        massage.msg();
    }
}
