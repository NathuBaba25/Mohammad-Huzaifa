import java.util.Scanner;
public class Store10TwoDarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]={{10,10,10,10,10},{10,10,10,10,10},{10,10,10,10,10},{10,10,10,10,10},{10,10,10,10,10}};
        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<=a.length-1;j++){
           System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
