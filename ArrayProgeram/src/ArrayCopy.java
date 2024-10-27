public class ArrayCopy {
    public static void main(String[] args) {
        int []a={1,2,3,4,4,5};
        int []b=new int [a.length];
        for(int i=0;i<=a.length-1;i++){
           b[i]=a[i];
            System.out.println("this is a frist element of array");
            System.out.println(b[i]);
        }
        System.out.println("Scound element of arry");
        for(int i=0;i<=b.length-1;i++){
            System.out.println(b[i]);
        }
    }

}
