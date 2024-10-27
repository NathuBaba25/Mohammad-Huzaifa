package StringProgram.src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpaceCharecterRegx {
    public static void main(String[] args) {
        Pattern p=Pattern .compile("\s");
        Matcher m=p.matcher("a7b k4bs#@");
        while (m.find()){
            System.out.println(m.start()+"......"+"....."+m.group());
        }
    }
}
