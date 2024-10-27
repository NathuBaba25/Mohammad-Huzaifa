package Collection;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class ReversUsingListEtrator {
    public static void main(String[] args) {
        Vector <String> vet=new Vector<>();
        vet.add("Abuzer");
        vet.add("Abbas");
        vet.add("Sayeed");
        vet.add("Huzaifa");
        vet.add("Haris");
        vet.add("Hamza");
       ListIterator lis= vet.listIterator();
        //while (lis.hasNext()){
           // System.out.println("ELEMENT IS:"+lis.next());
      //  }
        System.out.println("Back word direction in java");
        while (lis.hasPrevious()){
            System.out.println( lis.previous());
        }
    }
}
