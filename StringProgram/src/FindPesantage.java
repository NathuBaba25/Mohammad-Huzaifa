package StringProgram.src;
public class FindPesantage {
    static void charecterall(String input){
        int totalinput=input.length();
        int upperCase=0;
        int lowercase=0;
        int digit=0;
        int other=0;
        for(int i=0; i<input.length();  i++){
            char ch=input.charAt(i);
            if(Character.isUpperCase(ch)){
                upperCase++;
            }
            else if(Character.isLowerCase(ch)){
                lowercase++;
            }
            else if (Character.isDigit(ch)){
                digit++;
            }
            else {
                other++;
            }
        }
        double upperCaseLetterPercentage=(upperCase*100)/totalinput;
        double lowerCaseLetterPercentage=(lowercase*100)/totalinput;
        double digitpersantage=(digit*100)/totalinput;
        double otherpersantage=(other*100)/totalinput;
        System.out.println("the persentage of uppercase"+upperCaseLetterPercentage+"%");
        System.out.println("the persentage of lowercase"+lowerCaseLetterPercentage+"%");
        System.out.println("the persentage of digit"+digitpersantage+"%");
        System.out.println("the persentage of other"+ otherpersantage+"%");
    }
    public static void main(String[] args) {
        charecterall("India is My Countray Is 100%");
    }
}
