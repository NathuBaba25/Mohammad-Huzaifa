public class CountTotalElementInArray {
     static int Sum(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,5,6};
        System.out.println(Sum(arr));

    }
}
