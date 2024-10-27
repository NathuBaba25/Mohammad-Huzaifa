import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankDetails {
    private String bankName;
    private String accHolderName;
    private long accNumber;

    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getAccHolderName() {
        return accHolderName;
    }
    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }
    public long getAccNumber() {
        return accNumber;
    }
    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }
    public void giveBankDetails(){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name :");
            String customername=br.readLine();
            System.out.print("\n");

            System.out.print("Enter the account number:");
            long accno=Long.parseLong(br.readLine());
            System.out.print("\n");

            System.out.print("Enter the bank name :");
            String bankname=br.readLine();

            setAccHolderName(customername);
            setAccNumber(accno);
            setBankName(bankname);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
