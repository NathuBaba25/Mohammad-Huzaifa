import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, sum = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(a+" "+b);
        for (int i = 1; i <= n-1 ; i++) {
            sum = a + b;
           // a = b;
           // b = sum;
            System.out.println(sum);
            a = b;
            b = sum;
        }
       // System.out.println(sum);
    }
}
