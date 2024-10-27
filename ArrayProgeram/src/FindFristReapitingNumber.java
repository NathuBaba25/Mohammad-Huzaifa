//import java.util.Scanner;
public class FindFristReapitingNumber {
    public static int ReaptingNumber(int arr[]){
    // int n=arr.length;
     for(int i=0;i < arr.length; i++) {
         for (int j = i + 1; j <arr.length; j++) {
             if(arr[i]==arr[j]) {
                 return arr[i];
             }
         }
     }
        return -1;
    }
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
       // System.out.println("Enter a number of N :");
       // int n=sc.nextInt();
        int arr []={1,2,3,2,4};
        //for(int i=0;i<n ; i++){
         //   arr[i]=sc.nextInt();
        //}
        System.out.println( ReaptingNumber(arr));
    }
}
