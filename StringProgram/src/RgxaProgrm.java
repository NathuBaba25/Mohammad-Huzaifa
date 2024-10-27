package StringProgram.src;

import java.util.regex.*;
public class RgxaProgrm {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a?");
        Matcher m = p.matcher("aababbaabaaba");
        while (m.find()){
            System.out.println(m.start()+"....."+m.group());
        }
    }
}
