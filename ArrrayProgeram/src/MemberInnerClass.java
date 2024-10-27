package ArrrayProgeram.src;

public class MemberInnerClass {
    private  int  a=10;
    class Innert{
        void show(){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        MemberInnerClass n=new MemberInnerClass();
        MemberInnerClass.Innert ob=n. new Innert();
        ob.show();
    }
}
