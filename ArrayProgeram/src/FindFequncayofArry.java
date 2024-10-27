public class FindFequncayofArry {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 2, 2, 3, 1, 8, 6, 5, 6};

        for (int i = 0; i < arr.length; ++i) {
            int x = arr[i];
            int count = 0;
           if (x == -1) continue;

            for (int j = 0; j < arr.length; ++j) {
                if (arr[j] == x) {
                    ++count;
                    arr[j] = -1;
                }
            }
            System.out.println("Feqvency of "+x+"is"+count+" ");
        }
    }
    }
