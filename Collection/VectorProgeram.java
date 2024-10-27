package Collection;
import java.util.Vector;
public class VectorProgeram {
    public static void main(String[] args) {
        Vector v=new Vector();
        System.out.println(v.capacity());
        for(int i=0;i<=10; i++){
            v.add(i);
        }
        System.out.println(v.add("A"));
        System.out.println(v.capacity());
        System.out.println(v);

    }
}
