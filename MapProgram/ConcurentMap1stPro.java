package MapProgram;
import java.util.ArrayList;
import java.util.Iterator;
public class ConcurentMap1stPro extends Thread {
    static ArrayList s=new ArrayList();
    public void run(){
        try {
            Thread.sleep(5000);
            System.out.println("Child thread updating list");
            s.add(10);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args)throws InterruptedException {
        s.add("Huzaifa");
        s.add("Balipur");
        s.add("frome");
        ConcurentMap1stPro m=new ConcurentMap1stPro();
        m.start();
        Iterator itr=s.iterator();
        while (itr.hasNext()){
            String s1=(String)itr.next();
            System.out.println(s1);
            Thread.sleep(3000);
        }
        System.out.println(s);
    }
}
