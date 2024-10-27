package Exception.src;

public class UsingThrowK {
    public static void main(String[] args) {
        int a=10;         int b=30;
        if(a>b){
            System.out.println("hello huzaifa ");
        }
        else {


            throw new NegativeArraySizeException("mohammad huzaifa");
        }
    }
}
