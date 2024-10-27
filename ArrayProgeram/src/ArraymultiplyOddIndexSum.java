public class ArraymultiplyOddIndexSum {
    public static void main(String[] args) {
        int s[]=new int[]{4,3,5,2,1,6,7};
        int i;
        for( i=0;i<=s.length-1;i++){
            if(i%2!=0){
               s[i]*=2;
                System.out.println("odd index  "  + s[i]);
            }

         else{
            s[i]+=10;
               System.out.println("even  index  " + s[i]);

         }

        }

    }
}
