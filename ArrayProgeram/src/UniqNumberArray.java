import java.util.Scanner;
public static boolean isUniqueNum(int number) {
    int digits = countDigits(number);
    int[] arr = new int[digits];
    for (int i = 0; i < digits; i++) {
        arr[i] = (int) number % 10;
        number = number / 10;
    }
    for (int i = 0; i < digits; i++) {
        for (int j = 0; j < digits; j++) {
            if (i != j && arr[i] == arr[j])
                return false;
        }
    }
    return true;
}

public static int countDigits(int number) {
    int count = 0;
    while (number != 0) {
        count++;
        number = number / 10;
    }
    return count;
}
public static void main(String args[]) {
    int number = 0;
    boolean res = false;
    Scanner scan = new Scanner(System.in);
    number = scan.nextInt();
    res = isUniqueNum(number);
    if (res)
        System.out.println(number + " is a unique number.");
    else
        System.out.println(number + " is not a unique number.");
}