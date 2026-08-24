import java.util.*;

public class Week_3_Session_15_01_Sort_Characters_by_Frequency {
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        List<Character> chars = new ArrayList<>(map.keySet());
        chars.sort((a, b) -> {
            int c = Integer.compare(map.get(b), map.get(a));
            return c != 0 ? c : Character.compare(a, b);
        });
        StringBuilder sb = new StringBuilder();
        for (char c : chars)
            for (int i = 0; i < map.get(c); i++) sb.append(c);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(frequencySort(sc.nextLine()));
        sc.close();
    }
}
