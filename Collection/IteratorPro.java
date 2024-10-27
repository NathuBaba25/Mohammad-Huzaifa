package Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorPro {
    public static void main(String[] args) {
        ArrayList  <String> l=new ArrayList<String>();
        l.add("Subhanllah");
        l.add("Alhamdulillah");
        l.add("Allah hu akbar");
        l.add("Mohammad");
        l.add ("Ahamed");
        Iterator itr= l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
