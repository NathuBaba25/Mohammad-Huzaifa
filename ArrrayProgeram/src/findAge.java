package ArrrayProgeram.src;
import java.time.LocalDate;
import java.time.Period;
public class findAge {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate birthDate=LocalDate.of(2004,7,15);
        int year= Period.between(birthDate,today).getMonths();
        System.out.println(today);
        System.out.println(birthDate);
        System.out.println(year);


    }
}
