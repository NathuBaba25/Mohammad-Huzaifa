package Huzaifa.src;

import java.util.function.Predicate;

public class Lambda implements Predicate<String> {
    public boolean test(String a) {
        return a.isEmpty();

    }
    public static void main(String[] args) {
        Lambda l=new Lambda();
        System.out.println(l.test("fg"));



    }
}