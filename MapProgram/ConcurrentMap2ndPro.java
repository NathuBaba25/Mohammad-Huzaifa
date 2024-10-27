package MapProgram;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap2ndPro extends Thread{
    static ConcurrentHashMap l=new ConcurrentHashMap();
    public void run(){
        try {

            Thread.sleep(100);
            System.out.println("Update the ConcurrentMap");
            l.putIfAbsent(103,"c");
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException{
        l.putIfAbsent(101,"A");
        l.putIfAbsent(102,"B");
        ConcurrentMap2ndPro m=new ConcurrentMap2ndPro();
        m.start();
        Set s1=l.keySet();
        Iterator n=s1.iterator();
        while (n.hasNext()){
            Integer k=(Integer)n.next();
            System.out.println(k+" ="+l.get(k)+" ");
            Thread.sleep(2000);
        }
        System.out.println(l);
    }

    }

