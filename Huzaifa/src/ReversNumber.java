public  class ReversNumber {
    public static void main(String[] args) {
        int n=12345,reminder,result=0;
        while ((n!=0)){
            reminder=n%10;
            result=result*10+reminder;
            n=n/10;
        }
        System.out.println("Revers number is:"+result);
    }
}