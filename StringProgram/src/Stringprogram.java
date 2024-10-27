package StringProgram.src;

public class Stringprogram {
    public static void main(String[] args) {
        String str = new String("Welcome to JavaTpoint").intern(); // statement - 1
        String str1 = new String("Welcome to JavaTpoint").intern(); // statement - 2
        System.out.println(str1 == str);

    }
}
