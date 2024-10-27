import java.util.*;
import java.util.Arrays;
public class FindMusingNumber {
    public static int MissinNumber(int[] arr) {

        int n = arr.length;
        int sum1 = ((n) * (n + 1)) / 2;
        int sum2 = 0;
        for (int i = 0; i < n; i++)
            sum2 = sum2 + arr[i];

        return sum1 - sum2;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6, 7, 8, 10};
        System.out.println("Missing number is:" + MissinNumber(arr));
    }
}

