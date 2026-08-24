import java.time.*;
import java.util.*;

public class Week_3_Session_12_01_Day_of_the_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        System.out.println(LocalDate.parse(date).getDayOfYear());
        sc.close();
    }
}
