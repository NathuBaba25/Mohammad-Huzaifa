public class FindMaxNumberIs2d {
    public static void main(String[] args) {
        int arr[][]={{1,0,1,1},{1,0,0,1},{1,0,1,0}};
        int maxcount=0;
        int i;
        for( i=0; i<3;  i++){
            int count=0;
            for(int j=0; j<4; j++) {
                if (arr[i][j] == 1)
                    count++;
            }
                if(maxcount<count) {
                    maxcount=count;

                }
        }
        System.out.println(maxcount);
    }
}
