package Collection;
import java.util.Enumeration;
import java.util.Vector;
public class DemoEnumeration {
    public static void main(String[] args) {
        Vector v=new Vector();
       for(int i=0 ;i<=10; i++) {
           v.addElement(i);
       }
        System.out.println(v);
        Enumeration s=v.elements();
        while(s.hasMoreElements()){
             Integer l=(Integer)s.nextElement();
             if(l%2==0){
                 System.out.println(l);
             }
        }
            System.out.println(v);
    }
}
