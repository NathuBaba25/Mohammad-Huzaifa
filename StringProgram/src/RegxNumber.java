package StringProgram.src;
import java.util.regex.*;
public class RegxNumber {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher m= p.matcher(args[0]);
        if(m.find() && m.group().equals(args[0])){
            System.out.println("Valid Number");
        }
        System.out.println("In Valid Number");
        }
    }

