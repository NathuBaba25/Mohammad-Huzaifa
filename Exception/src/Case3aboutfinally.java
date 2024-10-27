package Exception.src;

public class Case3aboutfinally {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
             try {
                 System.out.println("Subhanallah");
             }
              catch (ArithmeticException e){
                  System.out.println("Alhumdulillah");
              }

             finally {
                 System.out.println("hi");
             }

        }
        catch (NullPointerException b){
            System.out.println("Mohammad huzaifa will calld");
        }
        finally {
            System.out.println("bye");
        }
    }
}
