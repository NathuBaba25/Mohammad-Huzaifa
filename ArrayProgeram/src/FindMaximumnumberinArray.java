public class FindMaximumnumberinArray {
    public static void main(String[] args) {
        int b[]=new int[]{1,4,3,9,5,7,8};
        int max=0;
        for(int i=0;i<=b.length-1;i++){
            if(b[i]>max){
                max=b[i];


            }
        }
        System.out.println(max);
    }
}
