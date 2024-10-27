import java.util.Scanner;
public class PrintratangleinPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entr a number of row:");
        int r=sc.nextInt();
        System.out.println("Enter a number of colum :");
        int c=sc.nextInt();
        for(int i=1 ; i<=r; i++){
            for(int j=1; j<=c; j++){
                if(i==1 || i==r ||j==1 ||j==c)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}