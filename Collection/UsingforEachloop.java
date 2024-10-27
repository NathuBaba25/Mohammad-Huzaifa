package Collection;

import java.util.ArrayList;

public class UsingforEachloop {
    public static void main(String[] args) {
        ArrayList <String> m= new ArrayList<String>();
        m.add("Subhanllah");
        m.add("Alhamdulillah");
        m.add("Barakllah");
        m.add(null);
        m.add(3,"Allah");
        m.set(2,"r");

        System.out.println(m.size());
        System.out.println(m);
    }
}
