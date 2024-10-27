public class SumofMatrix2d {
    public static void main(String[] args) {
        int arr[][]={{9,5,7},{4,3,1},{5,3,1},{6,5,2}};
        int sum=0;
        for(int i=0;i<4; i++){
            for(int j=0;j<3;j++){
                sum=sum+arr[i][j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
