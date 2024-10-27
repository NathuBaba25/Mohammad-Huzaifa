package StringProgram.src;
import java.util.Scanner;
public class coutnChareceter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string name");
        String st=sc.nextLine();
        int charcount[]=new int[240];
        for(int i=0;i<st.length(); i++){
            char sh=st.charAt(i);
            charcount[sh]++;
        }
        System.out.println("Feqvanceas");
        for(int i=0; i<charcount.length; i++){
            if(charcount[i]>0){
                System.out.println(STR."Charecter is \{(char) i}':\{charcount[i]}");
                //System.out.println(charcount[i]);
            }
        }

    }
}
