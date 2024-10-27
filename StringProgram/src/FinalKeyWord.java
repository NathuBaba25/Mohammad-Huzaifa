package StringProgram.src;

public class FinalKeyWord {
    public static void main(String[] args) {
        final StringBuffer s=new StringBuffer("hello");
        StringBuffer st=s.append("Bye");
        System.out.println( st);
    }
}
