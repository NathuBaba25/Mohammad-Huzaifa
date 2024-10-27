package Collection;

import java.util.HashSet;

public class HasetExample {
    public static void main(String[] args) {
        HashSet defultset=new HashSet();
        defultset.add("A");
        defultset.add("B");
        defultset.add("C");
        HashSet caipecity=new HashSet(20);
        caipecity.add("D");
        caipecity.add("E");
        HashSet customset=new HashSet(20,2.0f);
        customset.add("f");
        customset.add("g");
        HashSet collectionset=new HashSet(defultset);
        collectionset.add("a");
        collectionset.add("h");
        System.out.println("Defult set"+" "+defultset);
        System.out.println("caipicity set"+" "+caipecity);
        System.out.println("custom set"+" "+customset);
        System.out.println("collection set "+" "+collectionset);

    }
}
