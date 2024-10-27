package Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class FindEven {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        for(int i=0; i<=10; i++ ){
            l.add(i);
        }
        System.out.println(l);
        Iterator  itr=l.iterator();
        while(itr.hasNext()){
            Integer n=(Integer)itr.next();
            if(n%2==0){
                System.out.println(n);
            }
            else {
                itr.remove();
            }
        }
        System.out.println(l);
    }
}
