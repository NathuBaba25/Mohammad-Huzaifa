public class SwpingNumberDiffrenceMethod {
    public static void swipingnumber(int a,int b){
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println(a+"\n"+b);

    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swipingnumber(a,b);
    }
}
