public class CopyElementBysimpleWay {
    public static void main(String[] args) {


    float a[]=new float[]{1.3f,2.4f,5.2f,6.3f,7.5f};
    float b[]=new float[a.length];
    for(int i=a.length; i>0;i--){
        b[i]=a[i];
        System.out.println(b[i]);
    }
}}
