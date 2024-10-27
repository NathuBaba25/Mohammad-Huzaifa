package Exception.src;

import java.util.ArrayList;
import java.util.Iterator;
public class IligalException {
    public static void main(String[] args) {
       // Thread s=new Thread();
       // s.start();
       // s.start();
        ArrayList  <String> S=new ArrayList  <String>  ();
        S.add("a");
        S.add("B");
        S.add("c");
       // System.out.println(S);
        Iterator itr=S.iterator();
        while(itr.hasNext()){
            //System.out.println(itr.hasNext());
            Object Obj = itr.next();
            itr.remove();
        }
      // System.out.println(S);
    }
}
