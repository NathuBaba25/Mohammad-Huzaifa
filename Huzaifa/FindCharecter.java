package Huzaifa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCharecter {
    public static void main(String[] args) {

        int[] arr = {540, 540, 540, 490, 318, 318, 317, 319};
        //output = 0

        System.out.println(STR."Smallest number \{Arrays.stream(arr).boxed().sorted().findFirst().get()}");
        System.out.println("largest number " + Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).findFirst().get());

        Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((key,value)-> System.out.println(STR."\{key} = \{value}"));

       /* String str = "Hello, World!";
        char targetChar = 'l';
        int count = 0;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (c == targetChar) {
                count++;
            }
        }
        System.out.println("THE  OCCURENCE CHARECTER " + targetChar + ": " + count);*/
    }
}

