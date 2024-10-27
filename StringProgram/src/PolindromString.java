package StringProgram.src;

public class PolindromString {
    public static void main(String[] args) {
        String str="Mom";
        StringBuffer gtr=new StringBuffer(str);
        String s=gtr +"";
        if(str.equals(s)) {
            System.out.println("Palindrom String is:"+s);
        }
        else {
            System.out.println("Not polindrom String ");
        }
        }
    }







