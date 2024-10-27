package Huzaifa.src.Huzaifa;
import java.util.Scanner;
public class AromstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int n=sc.nextInt();
        int Armstrong=0, reminder;
        int z=n;
        while(n!=0){
            reminder=n%10;
            Armstrong=(reminder*reminder*reminder)+Armstrong;
            n=n/10;
        }
        if(z==Armstrong)
            System.out.println("This is a arm stromg number"+Armstrong);
        else
            System.out.println("Not Armstrong number");
    }
}