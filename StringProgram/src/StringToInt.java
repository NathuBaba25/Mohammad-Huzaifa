package StringProgram.src;

public class StringToInt {
    public static void main(String[] args) {
        String s="200";
        int  i=Integer.parseInt(s);
        System.out.println(i+100);
        String s1="200";
        Integer b=Integer.valueOf(s1);
        System.out.println(s+100);

    }
}
