package Exception.src;

public class FristProgeram {
    public static void main(String[] args) {
      Dostaff();
    }
    public static void Dostaff(){
      Staff();
    }

    public static void Staff() {
        NStaff();
    }
    public static void NStaff(){
        System.out.println(10/0);
    }
}
//Areathic matic exception in thread main;
