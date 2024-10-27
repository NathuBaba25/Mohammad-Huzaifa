public class CalculatesumAllAray {
    public static void main(String[] args) {
        int sum=0;
        int a[]=new int []{1,3,5,6,4,3,7};
        for(int i=0;i<=a.length-1;i++){
         sum=  sum + a[i];


    }
        System.out.println(sum);
    }
}
