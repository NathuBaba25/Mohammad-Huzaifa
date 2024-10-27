package Collection;
class A {
    Object show() {
        System.out.println("1");
        return null;
    }
}
public class ObjectType extends A
{
    public   String show(){
        System.out.println("bye");
        return null;

    }
    public static void main(String[] args)
        {
            A s=new A();
                s.show();
                ObjectType t=new ObjectType();
                t.show();

        }
}



