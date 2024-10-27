import java.util.Scanner;
public class PolindromnumberArray
{
    public static void main(String[] args)
    {
int [] arr;
int n=0,i=0,j=0,count=0,reminder=0,revers=0,temp=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a element of Array");
n=sc.nextInt();
arr=new int [n];
        System.out.println("Enter a number of element");
        for( i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a polindrom number");
        for( i=0;i < n;i++){
            temp=arr[i];
            revers=0;
        }
        while (temp!=0){
            reminder=temp%10;
            revers=(revers*10)+reminder;
           temp=temp/10;
        }
        if(arr[i]==revers) {
            System.out.println("this is a polindrom arry"+revers);
        }
    }
}