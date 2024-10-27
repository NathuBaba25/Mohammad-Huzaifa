package StringProgram.src;
class  test{
    void show(StringBuffer a){
        System.out.println("1");
    }
    void show(String a){
        System.out.println("Hello");
    }
}
public class ProgeramInString {
    public static void main(String[] args) {
        test s=new test();
        s.show("abc");

    }

}
