package Array;
import java.util.Arrays;
public class ArraySortObjandPrim {
    public static void main(String[] args) {
        int arr[]={1,3,4,2};
        System.out.println("Before sorting element:");
        for(int B: arr)
        System.out.println(B);
        Arrays.sort(arr);
        System.out.println("After sorting element");
        for(int S:arr){
            System.out.println(S);
        }
        String a[]={"A","B","D","C"};
        System.out.print("Before sorting element:");
        for(String M:a){
            System.out.print(M);
        }
        Arrays.sort(a);
        System.out.println("After sorting element");
        for(String N:a){
            System.out.println(N);
        }

    }
}
