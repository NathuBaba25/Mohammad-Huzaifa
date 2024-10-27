
public class Swapping {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Original value of A:"+a);
        System.out.println("Original value of B:"+b);
        System.out.println();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Ofter change the value of A:"+a);
        System.out.println("Oftre change the value B:"+b);
    }
}