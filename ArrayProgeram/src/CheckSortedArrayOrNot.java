public class CheckSortedArrayOrNot {
    static boolean checkArrayIsSortedOrNot(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {  // Array element 1 se suru hoga;
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 5};
         checkArrayIsSortedOrNot(arr);

        System.out.println(  checkArrayIsSortedOrNot(arr));

    }

}

