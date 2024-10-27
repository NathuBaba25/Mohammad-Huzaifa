import java.util.Scanner;
public class Print1to100numberinDiffrentLine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(a+" ");
                a+=1;
            }
            System.out.println();
       }
    }
}
