public class RemoveDublicateElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,5};
        int b=3;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==b){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
