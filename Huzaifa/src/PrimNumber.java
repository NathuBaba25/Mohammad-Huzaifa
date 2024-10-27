import java.util.Scanner;
public class PrimNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int a=0;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                a=1;
            }
        }
        if(a==0) {
            System.out.println("This is a primnumer"+n);
        }
        else{
            System.out.println("not primnumber"+n);
        }
    }
}