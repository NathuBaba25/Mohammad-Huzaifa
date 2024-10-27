public class FindscoundLargestNumberArray {
    public static void main(String[] args) {
        int a[] = new int[]{1, 4, 3, 2, 8, 7, 5};
        int max = 0;
        int smax = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
                smax=max;
            }
        }
        for(int i = 0;i<=a.length-1;i++){
            if (a[i] != max && smax <= a[i]) {
                smax = a[i];

            }

        }
        System.out.println(smax);
    }
}


