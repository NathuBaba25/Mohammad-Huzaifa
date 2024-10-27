public class MaximumNumberofMatrix {
    public static void main(String[] args) {
        int arr[][] = {{3, 5, 2}, {5, 3, 1}, {8, 5, 7}};
        int max = 0;
        int i;
        int j=0;
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                }

            }

        }
        System.out.println("MaximumValu is"+ max+ "row number is "+i+"and colum number is"+j);
    }
}
