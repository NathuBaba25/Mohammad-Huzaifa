package Exception.src;

import static java.lang.System.out;

public class HandleMultipleExceptionUsingSuprate {
    public static void main(String[] args) {
        try {
            // Some code that may throw different types of exceptions
            int[] numbers = {1, 2, 3};
            int result = 10 / 0; // This will throw ArithmeticException
            int number = numbers[5];
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
          System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

