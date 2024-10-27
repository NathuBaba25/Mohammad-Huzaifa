public class RecursionEven {
    public static void Even(int n){
        if(n==100) {
            return;
        }
            System.out.println(n);
         Even(n+2);
    }
    public static void main(String[] args) {
        int n=2;
        Even(n);
    }
}
