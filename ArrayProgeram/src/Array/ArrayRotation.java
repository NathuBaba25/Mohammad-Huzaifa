package Array;

public class ArrayRotation {
    public static void main(String[] args) {
        float b=10;
        System.out.println(b);
        System.out.println();
        int[] a = {1, 2, 3,4,5, 8};
        int n = 3;
        for (int i = 0; i < n; i++) {
            int frist = a[0], j;
            for (j = 0; j < a.length -1; j++) {
                a[j] = a[j + 1];
            }
            a[j] = frist;
        }
        for (int i = 0; i <= a.length-1; i++) System.out.println(a[i]);
    }   }

