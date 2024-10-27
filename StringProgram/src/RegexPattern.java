package StringProgram.src;

import java.util.regex.*;
public class RegexPattern {
    public static void main(String[] args) {
        int count =0;
       Pattern p=Pattern.compile("ab");
       Matcher m=p.matcher("abbabbaababababbab");
       while(m.find()){
           count++;
           System.out.println(m.start()+"........."+m.end()+"....."+m.group());
       }
    }
}
