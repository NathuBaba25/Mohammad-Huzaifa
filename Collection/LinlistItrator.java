package Collection;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinlistItrator {
    public static void main(String[] args) {
        LinkedList s = new LinkedList();
        s.add("Huzaifa");
        s.add("Mohammmad");
        s.add("Huzaifa");
        s.add("Khan");
        ListIterator m = s.listIterator();
        while (m.hasNext()) {
            String l = (String) m.next();
            if (l.equals("Huzaifa"))
                m.remove();
            if (l.equals("Mohammad"))
                m.add("Subhanallah");
            if (l.equals("Khan"))
                m.remove();
        }
        System.out.println(s);
    }
}




