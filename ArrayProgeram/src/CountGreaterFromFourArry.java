public class CountGreaterFromFourArry {
    public static void main(String[] args) {
        int s=0;
        int x[]=new int[]{2,3,5,7,6,9,8,1};
        for(int i=0;i<=x.length-1;i++){
            if(x[i]>=4){
                s++;
            }
        }
        System.out.println(s);
    }
}
