package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HasesetFromAnotherCollection {
    public static void main(String[] args) {
        ArrayList s1=new ArrayList();
        s1.add("Huzaifa");
        s1.add("Mohammad");
        s1.add("Alhamdulillah");
        s1.add("AllahuAkbar");
        HashSet <String> n=new HashSet<>(s1);
        n.add("M");
        Iterator l=n.iterator();
        while (l.hasNext()){
            System.out.println(l.next());
        }
    }
}
