package Array;
public class Sim {
    public static void main(String[] args) {
        //int arr[]={1,2,3,4,6,7};
       // int sume1=0;
       // int sume2=0;
       // int n=arr.length+1;
        int a=1;
        System.out.println("Table 1 to 20: ");
        for(int i=1; i<=5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
