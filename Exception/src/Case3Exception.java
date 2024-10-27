package Exception.src;

public class Case3Exception {
    public static void main(String[] args) {
        try {
            System.out.println("Mohammad Huzaifa");
        }
        catch (ArithmeticException e){
            System.out.println(10/0);
        }
        finally {
            System.out.println("Maliq kulmulk");
        }
    }
}
