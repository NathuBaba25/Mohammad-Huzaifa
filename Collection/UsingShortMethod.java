package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsingShortMethod {
    public static void main(String[] args) {
        List <String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        Collections.sort(list);
        for(String n:list){
            System.out.println(n);
        }
        ArrayList s=new ArrayList();
        s.add(11);
        s.add(12);
        s.add(10);
        s.add(6);
        Collections.sort(s);
        System.out.println(s);

    }
}
