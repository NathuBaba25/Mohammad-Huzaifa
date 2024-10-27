package Collection;

import java.util.WeakHashMap;

public class Weakmap {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap m=new WeakHashMap();
        temp t=new temp();
        m.put(t,"Huzaifa");
        System.out.println(m);
        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);
    }
}
class temp{
    public String  toString(){
        return "Temp";
    }
   public void finalize (){
       System.out.println("finalize method called Gc");
    }
}
