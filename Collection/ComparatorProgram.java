package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorProgram {
    public static void main(String[] args) {
        TreeSet s = new TreeSet(new Mycomparator());
        s.add(5);
        s.add(10);
        s.add(1);
        s.add(3);
        s.add(4);
        System.out.println(s);

    }
}
    class Mycomparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            Integer i1 = (Integer) o1;
            Integer i2 = (Integer) o2;

return +1;

        }



    }

