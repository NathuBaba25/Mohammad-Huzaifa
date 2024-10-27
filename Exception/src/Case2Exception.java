package Exception.src;

public class Case2Exception {
    public static void main(String[] args) {
          try {
              System.out.println("Alhumdulillah");
              System.out.println(10/0);
          }
          catch (NullPointerException p){
              System.out.println("Allahu akbar");
          }
          finally {
              System.out.println("Maliq");
          }
          int a=10,b=11;
        System.out.println( a+b+"Total sum number is:");
    }
}
