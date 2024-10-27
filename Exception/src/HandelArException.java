
public class HandelArException {
    public static void main(String[] args) {
        System.out.println("Statement.....1");
     try{
        System.out.println(10 / 0);
        System.out.println("Statement......2");
    }
    catch (Exception e) {
        e.printStackTrace();
        System.out.println(e);

    }
        System.out.println("Statement......3");
}
}
