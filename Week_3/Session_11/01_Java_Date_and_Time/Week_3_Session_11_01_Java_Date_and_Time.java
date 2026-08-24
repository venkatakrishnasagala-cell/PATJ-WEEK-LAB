import java.time.*;
import java.util.*;

public class Week_3_Session_11_01_Java_Date_and_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt(), day = sc.nextInt(), year = sc.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.getDayOfWeek());
        sc.close();
    }
}
