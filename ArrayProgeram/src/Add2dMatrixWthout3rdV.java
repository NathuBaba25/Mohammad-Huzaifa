public class Add2dMatrixWthout3rdV {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,3,2},{4,2,1}};
        int b[][]={{3,2,1},{4,2,1},{3,2,1}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
