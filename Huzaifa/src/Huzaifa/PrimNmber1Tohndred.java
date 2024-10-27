package Huzaifa;
import java.util.Scanner;
public class PrimNmber1Tohndred {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int count=0;
        int n=sc.nextInt();
        for(int i=2; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i%j==0){
                   count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
            count=0;
        }


    }
}
