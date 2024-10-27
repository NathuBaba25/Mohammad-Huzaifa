package Collection;

import java.util.Stack;

public class StackPro {
    public static void main(String[] args) {
        Stack s= new Stack ();
        s.push("A");
        s.push("A");
        s.push("b");
        s.push(1);
        System.out.println(s);
        System.out.println(s.search("A"));
        System.out.println(s.pop());

    }
}
