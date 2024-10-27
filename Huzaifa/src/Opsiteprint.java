public class Opsiteprint {
    public static int Number(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return Number(n-1);
    }

    public static void main(String[] args) {
        int n=100;
        Number(n);
    }
}