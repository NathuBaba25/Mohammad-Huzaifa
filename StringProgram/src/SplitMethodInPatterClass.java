package StringProgram.src;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SplitMethodInPatterClass {
    public static void main(String[] args) {
       /* Pattern p=Pattern.compile("\\s");
        String [] s=p.split("Subhanallah alhumdulillah Allahuakbar");
        for(String s2  :  s) {
            System.out.println(s2);
            List<Integer> integers = List.of(1, 3);
            List<Integer> list = Arrays.asList(1, 2, 3, 4);
            integers.add(123);
            integers.add(0,5);*/
        List <Integer> list1 = Arrays.asList(1,2);
        List <Integer>list2= Arrays.asList(5,6,7,8,9,10);
        Collections.copy(list2,list1);
       for(Integer a : list2){
           System.out.println(a);
       }


    }
}


