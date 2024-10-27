package StringProgram.src;

public class MaiximumOccurance {
    public static void main(String[] args) {
        String st="a b b a b d";
        st.replaceAll("\\s"," ");
        int arr[]=new int[127];
        for(int i=0 ; i<=st.length()-1; i++){
            arr[st.charAt(i)]=arr[st.charAt(i)]+1;
        }
        int max= -1;
        char ch= ' ';
        for(int i=0;i<st.length(); i++) {
            if (max < arr[st.charAt(i)]){
                max=arr[st.charAt(i)];
                ch=st.charAt(i);
            }
        }
         System.out.println("Maximum repeted charecter is"+" " +ch);
    }
}
