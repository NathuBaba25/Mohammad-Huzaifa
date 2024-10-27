
public class FindDublicateElement2d {
    public static void main(String[] args) {
        int a[][]={{5,2,3},{9,3,2},{5,4,3}};
        for(int i=0;i<3;i++ ){
            for(int j=0;j<3;j++){
                for(int k=i+1;k<3;k++) {
                    if (a[i][j] ==a[i][k]){
                        System.out.println("Dublicate value is"+a[i][j]);
                    }
                }
            }
        }
    }
}
