import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        String ans=(n%2==0)?"Even number" :"Odd Number";
        System.out.println(ans);
    }
}