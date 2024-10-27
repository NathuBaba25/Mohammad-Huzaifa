package Exception.src;
class younMarrage extends Exception{
    public younMarrage(String msg) {
        super(msg);
    }
}
public class ThrowException {
    public static void main(String[] args) throws younMarrage{
        throw new younMarrage("allowed");

    }
}
