public class ArrayusingMethod {
    static void sub(int arr[]) {
        int min = arr[0];
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
       }
    public static void main(String[] args) {
        int a[]={1,2,3,45,6,5};
        ArrayusingMethod b=new ArrayusingMethod ();
        b.sub(a);
    }
    }

