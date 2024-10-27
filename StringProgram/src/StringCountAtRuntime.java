package StringProgram.src;

import java.util.Scanner;
public class StringCountAtRuntime {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String input = sc.nextLine();//.equalsIgnoreCase();
        System.out.println("Enter a charecter to Search for ");
           char search=sc.next().charAt(0);
           int count=0;
        for(int i=0;i<input.length(); i++){
            if(input.charAt(i)==search){
                count++;
            }
        }
        if(count>0){
            System.out.println("This charecter '" + search + "' is present in the string.");
            System.out.println("this charecter '" + search + "' occurs " + count + " times.");
        }
        else {
            System.out.println("The character '" + search + "' is not present in the string.");
        }


    }
}
