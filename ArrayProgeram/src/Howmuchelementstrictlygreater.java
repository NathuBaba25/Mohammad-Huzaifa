public class Howmuchelementstrictlygreater {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,7,6,9};
        int x=4;
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>x){
               count++;
            }
        }
        System.out.println(count);
    }
}
