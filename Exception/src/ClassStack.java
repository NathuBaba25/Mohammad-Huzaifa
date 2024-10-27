package Exception.src;

public class ClassStack {
    public static void main(String[] args) {
        String s=new String("Huzaifa");
        Object st=(Object) s;
       System.out.println(st);
       Object sb = new Object();
        String s1=(String) sb;

       // Object o=new String("huz");
       // String s=(String)o;
       // System.out.println(s);
    }
}
