package Exception.src;

public class FainallyandReturn {
    public static void main(String[] args) {
        System.out.println(m1());
    }
    public static int  m1() {
        try {
            System.out.println("hello");
            return 22;
        } catch (Exception e) {
            System.out.println("hi");
            return 444;
        }
        finally {
            System.out.println("bye");
            return 55;
        }
    }
}
