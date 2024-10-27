package StringProgram.src;
import java.util.Scanner;
public class AccountNumber {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter a digit");
     String account=sc.nextLine();
     char []ch=account.toCharArray();
     for( int i=0;  i<ch.length;  i++){
         if(i<ch.length-4){
             System.out.print("*");
         }
         else{
             System.out.print(ch[i]);
         }
     }

    }
}
