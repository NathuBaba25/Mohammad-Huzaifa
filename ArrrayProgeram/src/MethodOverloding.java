package ArrrayProgeram.src;
class M{
    void show(){
        System.out.println("Huzaifa");
    }
}
class B extends M{
    void show(){
        System.out.println("Huzaifa");
    }
}
public  class MethodOverloding {
    public static void main(String[] args) {
        M S=new B();
        S.show();
    }

}
