import java.util.*;

public class Week_3_Session_14_02_Java_Comparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> a = new ArrayList<>();
        for (int i = 0; i < n; i++) a.add(sc.next());
        a.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        for (String s : a) System.out.println(s);
        sc.close();
    }
}
