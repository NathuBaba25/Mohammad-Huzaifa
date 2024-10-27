package ArrylistProgram;
import java.util. * ;
public class Al2ndProgram {
    public static void main(String args[]) {
        ArrayList l = new ArrayList();
        l.add("am");
        l.add('h');
        l.add(10);
        l.add(2.12);
        l.add("huaz");
     Iterator itr=l.iterator();
     while (itr.hasNext())
         System.out.println(itr.next());
     }
}

