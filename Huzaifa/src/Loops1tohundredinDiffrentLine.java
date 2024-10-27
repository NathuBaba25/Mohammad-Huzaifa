public class Loops1tohundredinDiffrentLine {
    public static void main(String[] args) {
        int a=1;
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.print(" "+a);
                a+=10;
            }
            a=i+1;
            System.out.println();
        }
    }
}
