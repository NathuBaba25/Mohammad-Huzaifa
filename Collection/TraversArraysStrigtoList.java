package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TraversArraysStrigtoList {
    public static void main(String[] args) {
        String s[]={"java","Python","C++"};
        System.out.println("Convert to List"+ Arrays.toString(s));
        List<String > list=new ArrayList<String>();
        for(String Lang:s){
            list.add(Lang);

        }
        System.out.println(list);
    }
}
