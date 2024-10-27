package StringProgram.src;

import java.util.*;
public class Tkenizer {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("Huzaifa khan From Balipur");
        StringTokenizer s=new StringTokenizer("Khan mohammad huzaifa");
        /*while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
            System.out.println(s.nextToken());
        }*/


        String string = new String("ayaz");
        String string1 = "huzaifa";
        String string2 = string.intern();
        System.out.println(string==string2);
        System.out.println(string.equals(string2));
    }
}
