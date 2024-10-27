public  class MissingElementInArray {
    public static void main(String[] args) {
        int Sum1=0,Sum2=0;
        int arr[]={1,2,3,4,5,7,8};
        for(int i=0;i< arr.length;i++){
            Sum1=Sum1+arr[i];
        }
        for(int j=1;j<=arr.length+1;j++){
            Sum2=Sum2+j;
        }
        System.out.println("Missing element is:"+(Sum2-Sum1));
    }
}