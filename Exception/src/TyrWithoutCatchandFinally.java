package Exception.src;

import java.io.FileReader;
public class TyrWithoutCatchandFinally {
    public static void main(String[] args) throws Exception{

        try (FileReader ftr=new FileReader("input.text")){

        }

    }
}
