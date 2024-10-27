public class ArrayUsingReturnType {
    static int[] get(){
        return new int[]{10,20,30,40,50,90};
    }

    public static void main(String[] args) {
        int a[]=get();
        for(int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }
    }
}
