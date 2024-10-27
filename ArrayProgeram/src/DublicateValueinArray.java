public class DublicateValueinArray {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 2,5, 5, 6, 1,3};
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = i+1; j <= a.length - 1; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Dublicate value is"  +a[j]+" ");
                }
            }
        }
    }


}
