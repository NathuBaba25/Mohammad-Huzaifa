package Exception.src;

public class ThrowsExcept {
    void M()throws NullPointerException{
        throw new NullPointerException("Bye Huzaifa");
    }
}
class TestThrow{
 public static void main(String args[])throws NullPointerException{
      ThrowsExcept s=new   ThrowsExcept();
      s.M();
    }
}
