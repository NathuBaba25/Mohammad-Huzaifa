package Collection;

import java.util.LinkedList;
public class LinklistProgram {
    public static void main(String[] args) {
        LinkedList s=new LinkedList();
        s.add("Huzaifa");
        s.add("mohammad");
        s.add("Huzaifa");
        s.add(null);
        s.set(0,"saftewAre");
        System.out.println(s.get(2));
        s.add(0,10);
        s.removeLast();
        s.addFirst("Allahhu ");
        System.out.println(s);


    }
}
