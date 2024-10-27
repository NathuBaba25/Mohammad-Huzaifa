package ArrrayProgeram.src;

public class staticnestedclass {
    static int data =10;
   static class Inner{
       void show(){System.out.print("data is"+data);}
   }

    public static void main(String[] args) {
        staticnestedclass .Inner obj=new staticnestedclass.Inner();
        obj.show();
    }
}
