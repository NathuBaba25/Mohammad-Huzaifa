package Huzaifa.src.Huzaifa;

public class SumofScii {
    public static void main(String[] args) {
        String str="Huzaifa";
        long x=0;
        for(int i=0;i<str.length(); i++){
            char c=str.charAt(i);
            long d=(long)c;
          System.out.println(d);
           x+=d;
       }
        System.out.println(x);
        int a[]={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<a.length; i++){
            a[i]*=i;
            System.out.println(a[i]);
            sum+=a[i];
        }
        System.out.println(sum);
   }
}
