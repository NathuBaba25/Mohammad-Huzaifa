package StringProgram.src;

import java.util.regex.*;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[^abc]");
        Matcher m = p.matcher("[a7b@gs2#9]");
        while(m.find()){
            System.out.println(m.start()+"........"+m.group());
        }
    }
}
