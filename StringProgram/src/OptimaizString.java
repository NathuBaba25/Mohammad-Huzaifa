package StringProgram.src;

public class OptimaizString {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        for(int i=0; i<100000; i++) {
            String s = "India";
            String s1 = "India";
        }
            long endTime=System.currentTimeMillis();
            System.out.println("take time to litral String :"+(endTime-startTime)+" ms");
          long startTime1=System.currentTimeMillis();
          for(int i=0; i<100000; i++){
              String s=new String("hello");
              String s2=new String("hello");
          }
          long endTime1=System.currentTimeMillis();
        System.out.println("time to take to careate String :"+(endTime1-startTime1)+" ms ");

    }
}
