public class CopyArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        for(int i=0;i<a.length;i++){
            System.out.print("Original element is"+ ""+a[i]);
        }
        int b[]=a;
        for(int j=0;j<a.length;j++){
         System.out.println("Copy element is:"+b[j]);
        }
    }

}
