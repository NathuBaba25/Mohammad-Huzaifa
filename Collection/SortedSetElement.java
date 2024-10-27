package Collection;
import java.util.SortedSet;
import java.util.TreeSet;
public class SortedSetElement {
    public static void main(String args []) {
        int count=0;
        SortedSet set=new TreeSet();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println("This element is Sorted is ");
      for(Object object: set){
          System.out.println(object);
      }
        }
    }
