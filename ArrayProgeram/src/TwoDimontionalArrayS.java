public class TwoDimontionalArrayS {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 4}, {4, 3, 1},{3,5,2}};
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

