import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 0;

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        max = map.size();

        for (int i = k; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            int remove = arr[i - k];

            if (map.get(remove) == 1) {
                map.remove(remove);
            } else {
                map.put(remove, map.get(remove) - 1);
            }

            max = Math.max(max, map.size());
        }

        System.out.println(max);

        sc.close();
    }
}
