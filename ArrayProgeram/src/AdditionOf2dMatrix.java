public class AdditionOf2dMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{3,2,1}};
        int brr[][]={{3,2,1},{2,4,1}};
        int Crr[][]=new int [2][3];
        for(int i=0;i<2 ;i++){
            for(int j=0;j<3;j++){
             Crr[i][j]=arr[i][j]+brr[i][j];
            }
            System.out.println();
        }
        for(int i=0;i<2;i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(Crr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
