public class InArryFindSimilarElement {
    public static void main(String[] args) {
        int arr1[]={12,13,11,19,99,5,8};
        int arr2[]={11};
        for(int i=0;i<arr1.length;i++) {
            for(int j=0;j<arr2.length;j++) {
                System.out.println(arr2[j]);
               if(arr1[i] == arr2[j]){
                   System.out.println(arr1[i]);

               }

            }
           // System.out.println(arr1[i]);
       }
    }
}
