package ArrylistProgram;

import java.util.ArrayList;

public class FristProgeram {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add('A');
        l.add(10);
        l.add("A");
        l.add(null);
        l.add(2.0);
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
       l.add(2,'h');
        System.out.println(l);
        System.out.println(l);

    }
}
