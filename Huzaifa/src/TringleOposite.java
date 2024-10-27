import java.util.Scanner;
public class TringleOposite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number M");
        int m=sc.nextInt();
        for(int i=1;   i<=m;    i++){
            for(int j=1;  j<=i;  j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
