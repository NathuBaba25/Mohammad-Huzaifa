public class ArrayPairs {
    public static void main(String[] args) {
        int z[]=new int[]{1,2,3,4,6,5,8,7};
        System.out.println(z.length);
        int a=6;
        int Total=0;
        for(int i=0;i<=z.length;i++){
          for(int j=0; j<=z.length-1;j++){
              for(int k=j+1;k<=z.length-1;k++) {
                  if (z[i] + z[j]+z[k] == a) {
                      Total++;
                      System.out.println("pairs" + z[i] + " " + z[j]+" "+z[k]);
                  }
              }
          }

        }
        System.out.println(Total);
    }
}
