package Exception.src;

public class Expropegat {
    void m(){
        int data=10/0;
    }
    void n(){
        m();
    }
    void p(){
        try {
            n();
        }
        catch(  Exception e){
            System.out.println("Exception propegation");
        }
    }

    public static void main(String[] args) {
        Expropegat s=new Expropegat();
        s.p();
    }
}
