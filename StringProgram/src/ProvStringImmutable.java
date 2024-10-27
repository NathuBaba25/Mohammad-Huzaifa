package StringProgram.src;
    public class ProvStringImmutable {
    public static void charecter(Object x, Object y) {
        if (x == y) {
            System.out.println("the pointing to the same refrence");
        } else {
            System.out.println("Both are different refrence");
        }
    }
    public static void main(String[] args) {
      String str1="java";
      String str2="java";
        System.out.println("Before modification");
      charecter(str1, str2);
        System.out.println("After modification");
      str1+="ava";
      charecter(str1,str2);

    }
}
