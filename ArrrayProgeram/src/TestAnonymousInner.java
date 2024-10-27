package ArrrayProgeram.src;

 abstract  class person {
    abstract  void eat();
}
 public class TestAnonymousInner{
     public static void main(String[] args) {
         person s=new person() {

             void eat() {
                 System.out.println("hello");
             }
         };

         s.eat();
     }
 }
