import java.time.*;
import java.util.*;

public class Week_3_Session_11_02_Number_of_Days_Between_Two_Dates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d1 = sc.next(), d2 = sc.next();
        LocalDate a = LocalDate.parse(d1);
        LocalDate b = LocalDate.parse(d2);
        System.out.println(Math.abs(java.time.temporal.ChronoUnit.DAYS.between(a, b)));
        sc.close();
    }
}
