package Collection;
import java.util.Hashtable;
public class MapHastableProgeram {
    public static void main(String[] args) {

        Hashtable<Temp, String> st=new Hashtable<Temp, String>();
        st.put(new Temp(2),"H");
        st.put(new Temp(5),"M");
        st.put(new Temp(10),"A");
        st.put(new Temp(14),"K");
        System.out.println(st);
    }
}
class  Temp{
    int i;
    public Temp(int i){
        this.i=i;
    }
    public int hashCode() {
        return i;
    }
    public String toString(){
        return i+"";
    }
}

