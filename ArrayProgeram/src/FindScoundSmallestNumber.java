public class FindScoundSmallestNumber {
    public static int getNumber(int arr[],int total) {
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[1];
    }
    public static void main(String[] args) {
      int arr[]  ={1,2,3,4,5,6};
      int brr[]={44,55,67,56,44,40,23};
        System.out.println(getNumber(arr,6));
        System.out.print(getNumber(brr,7));
    }
}