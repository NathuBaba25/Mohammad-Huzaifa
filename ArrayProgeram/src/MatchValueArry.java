public class MatchValueArry {
    public static void main(String[] args) {
        int a=12;
        int [] b=new int []{1,4,6,8,5,3,9,7};
        for(int i=0;i<=b.length-1;i++){
            for(int j=i+1;j<=b.length-1;j++){
                if(b[i]+b[j]==a){
        System.out.println(b[i]);
                }
            }
        }

    }
}