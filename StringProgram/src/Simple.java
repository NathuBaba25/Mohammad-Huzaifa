package StringProgram.src;

public class Simple {
    public static void main(String[] args) {
        String str = "huhuhubibibikkkk";
        int[] frequency = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            frequency[c]++;
        }
        char maxChar = '\0'; // Initialize with a null character
        int maxCount = 0;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                maxChar = (char) i;
            }
        }
        if (maxChar != '\0') {
            System.out.println("The most frequent character is: " + maxChar);
            System.out.println("Frequency: " + maxCount);
        } else {
            System.out.println("No characters found.");
        }
    }
}
