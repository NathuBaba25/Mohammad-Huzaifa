package Exception.src;

public class IndexoutofBound {
    public static void main(String[] args) {
        int a[]=new int[10];
        a [0]=0;
        a[1]=2;
        System.out.println(a[1]);
        System.out.println(a[100]);
    }
}
