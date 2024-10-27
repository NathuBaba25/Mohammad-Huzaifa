package Exception.src;

import java.io.IOException;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
           // System.out.println(10/0);
            String st=null;
              st.length();
        }
        catch (ArithmeticException | NullPointerException e){
            System.out.println("Hello Huzaifa");
        }
        }
    }


