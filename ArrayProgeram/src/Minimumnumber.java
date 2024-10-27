public class Minimumnumber {
    public static void main(String[] args) {
        int b[]=new int[]{5,3,2,5,69,11};
        int min=9;
        for(int i=0;i<b.length-1;i++){
            if(b[i]<min){
              min=b[i];
            }
        }
        System.out.println(min);
    }
}
