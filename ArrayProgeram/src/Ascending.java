public class Ascending {
    public static  boolean isAscending(int arr[]){
         boolean cheak=true;
      for(int i=1;i< arr.length;i++) {
          if (arr[i]<arr[i-1]) {
              cheak =false;
              break;
          }
      }
      return cheak;
    }
    public static void main(String[] args) {
       int arr[] ={1,2,3,5,6};
        System.out.println(isAscending(arr));
    }
}
