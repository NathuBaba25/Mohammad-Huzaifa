package MapProgram;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
public class MapFristProgram {
    public static void main(String[] args) {
        HashMap s=new HashMap();
        s.put(101,"huzaifa");
        s.put(10,"Mohammad");
        s.put(30," khan");
        s.put(40,"Alhamdulillah");
        System.out.println(s.remove(101,"Mohammad"));
      // System.out.println(s);
       // System.out.println(s.get(10));
       // System.out.println(s.containsKey(30));
        System.out.println(s.remove(101));
      //  System.out.println(s.put("huzaifa",1000));
       // Set m=s.keySet();
      //  System.out.println(m);
       // Collection  c=s.values();
       // System.out.println(c);

    }
}
