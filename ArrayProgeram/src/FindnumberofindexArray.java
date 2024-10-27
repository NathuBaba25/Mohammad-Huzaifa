public class FindnumberofindexArray {
    public static void main(String[] args) {
        int x[]=new int []{80,40,70,30,21,90};
        int a=35;
        for(int i=0;i<=x.length-1;i++){
            if(x[i]>a){
                System.out.println(x[i]+"index number is"+i);
            }
        }
    }
}
