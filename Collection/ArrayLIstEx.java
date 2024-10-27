package Collection;

import java.util.ArrayList;
public class ArrayLIstEx {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<Integer>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(2);
        s.add(4);
        s.add(3);
        s.add(4);
          for(Integer i=0; i<s.size();i++){
          for(Integer j=i+1; j<s.size(); j++){
              if(s.get(i).equals(s.get(j))){
                  System.out.println("Duplicate element is "+ s.get(i));
              }
          }

          }


    }
}


