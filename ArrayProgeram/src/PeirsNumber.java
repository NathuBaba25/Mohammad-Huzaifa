public class PeirsNumber {
    public static int  Number(int arr[]) {
        int x = 6;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
       int brr[] ={1,2,3,4,5,6,3};
        System.out.println("Pairs number is:"+Number(brr));
    }
}

