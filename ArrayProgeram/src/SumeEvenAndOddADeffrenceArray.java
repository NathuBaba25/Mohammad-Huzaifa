public class SumeEvenAndOddADeffrenceArray {
    public static void main(String[] args) {
        int h[] = new int[]{5, 4, 5, 6, 5, 3, 5};
        int Sumeven = 0;
        int Oddnumber=0;
        for (int i = 0; i <= h.length - 1; i++) {
            if (i % 2 == 0) {
                Sumeven = Sumeven + h[i];
            } else {
                Oddnumber+= h[i];

            }
        }
        int s=Sumeven-Oddnumber;
        System.out.println(s);
    }
}