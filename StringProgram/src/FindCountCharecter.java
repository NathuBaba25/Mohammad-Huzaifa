package StringProgram.src;

public class FindCountCharecter {
    public static void main(String[] args) {
        String str = "aaaabbbbcccdddee";
        String st = "" + str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr  = str.charAt(i);
            char pre = str.charAt(i - 1);
            if (curr==pre) {
                count++;
            }
            else{
                st +=count;
                count=1;
                st+=curr;


            }
        }
        st+=count;
        System.out.println("\n"+st+ "  ");
    }
}

