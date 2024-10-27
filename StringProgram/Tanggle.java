package StringProgram;
//import java.sql.SQLOutput;
import java.util.*;
public class Tanggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        System.out.println(sb);
        for(int i=0; i<sb.length(); i++){
           boolean flag= true;
           char ch=sb.charAt(i);
            if(ch==' ') continue;
           int asci=(int)ch;
           if(asci>=97) flag = false;//small
           if(flag==true){
               asci+=32;
               char d=(char)asci;
               sb.setCharAt(i,d);
           }
           else{
               asci -=32;
               char d=(char) asci;
               sb.setCharAt(i,d);
           }
           }
        System.out.println(sb);
        }
    }

