public  class PolindromNumber {
    public static void main(String[] args) {
        int n=121,Reminder,result=0;
        int z=n;
        while (n!=0){
            Reminder=n%10;
            result=(result*10)+Reminder;
            n=n/10;
        }
        if(z==result)
            System.out.println("Polindrom number is:"+result);
        else
            System.out.println("Not polindrom number");
    }
}