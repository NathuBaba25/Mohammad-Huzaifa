public class RatanglePrintNumber {
    public static void main(String[] args) {
        int r=4;
        for(int i=1; i<=r;  i++){
            for(int  j=i;  j<=r;  j++){
                System.out.print(j);

            }
            for(int k=1;  k<=i;  k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
