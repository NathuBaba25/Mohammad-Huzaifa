public class DimondPrintPattern {
    public static void main(String[] args) {
        int r =  4;
        int c =  5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = r; i >= 1; i--) {
            for (int j = i; j <= c - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
