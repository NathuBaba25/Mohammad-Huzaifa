public class ArrayProdect
{
    public static void main(String[] args) {
        int prodect=1;
        int h[]=new int []{5,4,3,2,1,};
        for(int i=0;i<=h.length-1;i++){
            prodect=prodect*h[i];
        }
        System.out.println(prodect);
    }
}
