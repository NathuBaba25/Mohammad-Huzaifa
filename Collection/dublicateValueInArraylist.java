package Collection;
import java.util.ArrayList;
public class dublicateValueInArraylist {
    public static void main(String[] args) {
        int count=0;
        ArrayList<Integer> s = new ArrayList<Integer>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(2);
      for (Integer i=0; i<s.size(); i++){
          for(Integer j=0; j<= s.size(); j++){
              if(i==j){

                  System.out.println(j);
              }
          }
      }
    }
}