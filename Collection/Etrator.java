package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class Etrator {
    public static void main(String[] args) {
            LinkedList L=new LinkedList();
            L.add("Huzaifa");
            L.add("Mohammad");
            L.add("Subhanllah");
            L.add("Alhamdulillah");
            L.add("Allah hu akbar");
            System.out.println(L);
           ListIterator itr= L.listIterator();
            while (itr.hasNext()){
                String s=(String)itr.next();
                if(s.equals("Mohammad"))
                    itr.remove();
                if(s.equals("Huzaifa"));
                itr.add("Subhanallah");
                if(s.equals("Allhamdulillah"));
                itr.add("Maliq");
            }
        }
        }


