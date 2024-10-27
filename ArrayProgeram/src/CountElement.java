public class CountElement {
    public static void main(String[] args) {
        int a[]={1,3,4,3,5,3,3};
       int x=3;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==x) {
                count++;
            }

        }
        System.out.println(count);
    }
}


/*public class CountElement
{
    public static void main(String[] args) {
        int arr[]=new int [5];
        int b=arr.length;

    }
}

 */

