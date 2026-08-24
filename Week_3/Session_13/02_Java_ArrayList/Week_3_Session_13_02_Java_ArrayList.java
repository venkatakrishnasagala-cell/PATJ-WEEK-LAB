import java.util.*;

public class Week_3_Session_13_02_Java_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> rows = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < d; j++) row.add(sc.nextInt());
            rows.add(row);
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            int x = sc.nextInt() - 1, y = sc.nextInt() - 1;
            if (x >= 0 && x < rows.size() && y >= 0 && y < rows.get(x).size())
                System.out.println(rows.get(x).get(y));
            else System.out.println("ERROR!");
        }
        sc.close();
    }
}
