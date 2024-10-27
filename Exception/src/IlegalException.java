package Exception.src;

public class IlegalException {
    public static void main(String[] args) {
        Thread s=new Thread();
        s.setPriority(10);
        s.setPriority(100);
    }
}
