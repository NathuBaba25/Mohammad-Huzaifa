public class SwapNumberArray {
    public static void main(String[] args) {
        int a[] = {2, 5, 3,};
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
        int temp = a[0];
        a[0] = a[1];
        a[1] = a[2];
        System.out.println(a[2] + " " + a[0] + " " + temp);

    }
}
