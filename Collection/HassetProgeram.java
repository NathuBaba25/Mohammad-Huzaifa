package Collection;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;

public class HassetProgeram {
    public static void main(String[] args) {
        HashSet h=new HashSet();
        h.add("Subhanallah");
        h.add("Alhamdulillah");
        h.add(10);
        h.add(null);
        System.out.println(h);
        Iterator itr=h.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
