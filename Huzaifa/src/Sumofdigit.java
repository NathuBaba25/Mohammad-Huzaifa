import java.util.*;
public class Sumofdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a digit");
        int s=sc .nextInt();
        int result=0;
        while(s > 0){
            result+=s%10;
            s=s/10;
        }
        System.out.println("Total sum of number is:"+result);
    }
 }
