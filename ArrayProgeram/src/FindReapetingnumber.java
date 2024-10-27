public class FindReapetingnumber {
    public  static int  Reapt(int arr[]){
        for(int  i=0;i< arr.length;i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                     return arr[i];
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
      int arr[]={1,2,3,1,5,6};
        System.out.println("Reapating number is:"+Reapt(arr));
    }
}
