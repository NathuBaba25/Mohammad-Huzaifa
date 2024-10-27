package Exception.src;

public class Nuberformet {
    public static void main(String[] args) {
        try {
            Float fl=new Float("3.0");
            int a=fl.intValue();
            byte b=fl.byteValue();
            double c=fl.doubleValue();
            System.out.println(a+b+c);

        }
        catch (Exception e){
            e.printStackTrace();}
    }
}
