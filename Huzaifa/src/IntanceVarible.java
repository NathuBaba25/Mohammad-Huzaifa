public class IntanceVarible {
    int a=10;
    float b=30f;
    double s=40;
    double g=s+b;
    long d=30L;
    char ch='a';
    long q=a+d+ch;
    public static void main(String[] args) {
     IntanceVarible a=new IntanceVarible();
        System.out.println(a.g);
        System.out.println(a.q);
    }
}
