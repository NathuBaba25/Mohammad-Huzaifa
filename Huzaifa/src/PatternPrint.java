public class PatternPrint {
    public static void main(String[] args) {
        int m=7;
        for(int i=0;i<=m;i++){
            for(int j=2*(m-i);j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
           System.out.println();
        }
    }
}
