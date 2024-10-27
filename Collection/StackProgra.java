package Collection;

import java.sql.SQLOutput;
import java.util.Stack;

public class StackProgra {
    public static void main(String[] args) {
        Stack  s=new Stack();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        System.out.println(s.pop());
       System.out.println(s.push("h"));
       System.out.println(s.search("D"));
       System.out.println(s);
       System.out.println(s.peek());
       System.out.println(s.empty());

    }
}
