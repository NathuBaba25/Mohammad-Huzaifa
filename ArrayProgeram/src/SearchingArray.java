public class SearchingArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int x=5;
        for(int i=0;i<=a.length-1;i++){
            if(a[i]==x){
                System.out.println("it is present in array"+a[i]+"\n and index number is"+i );
            }
        }
    }
}
