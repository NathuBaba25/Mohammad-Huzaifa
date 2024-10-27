package StringProgram.src;

public class ReversCharecter{
    public static void main(String[] args) {
        String s="deep";
        String s1="";
        for(int i=s.length()-1; i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}
