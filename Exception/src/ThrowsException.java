package Exception.src;

import java.io.IOException;

public class ThrowsException {
    void n() throws IOException {
        throw new IOException("User find exceptinon");
    }

    void m() throws IOException {
        n();
    }

    void p() {
        try {
            m();
        }
        catch (Exception w){
            System.out.println("Huzaifa");
        }
    }

    public static void main(String[] args) {
        ThrowsException  obj=new ThrowsException();
        obj.p();
        System.out.println("Normal flow");
    }
}
