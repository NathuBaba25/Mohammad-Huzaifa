package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayExample {
    public static void main(String[] args) {
        List<String> s=new ArrayList();
        s.add("Mohammad");
        s.add("Ahamed");
        s.add("Subhanallah");
        s.add("Alhamdulillah");
        String s1[]=s.toArray(new String[ s.size()]);
        System.out.println("Arrays print is:"+ Arrays.toString(s1));
    }
}
