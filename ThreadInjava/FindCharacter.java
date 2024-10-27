package ThreadInjava;

import java.util.Scanner;

public class FindCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine().toLowerCase();
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch]++;
        }
        char maxChar = '\0';
        int maxCount = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = (char) i;
            }
        }
        System.out.println("the charecter com to :"+maxCount+""+maxChar);
    }
}