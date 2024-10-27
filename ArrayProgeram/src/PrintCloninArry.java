public class PrintCloninArry {
    public static void main(String[] args) {
        int arr[]={33,1,2,3,4,5};
        System.out.println("Print riganal Array");
        for(int i:arr)
        System.out.println(i);
        System.out.println("Print clone array");

        int crr[]=arr.clone();
        for(int i:crr)
            System.out.println(i);

        System.out.println("Are both eqwel");
        System.out.println(arr==crr);
    }

}
