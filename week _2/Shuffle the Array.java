import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = new int[2 * n];

        int k = 0;

        for (int i = 0; i < n; i++) {
            ans[k++] = nums[i];
            ans[k++] = nums[i + n];
        }

        for (int i = 0; i < 2 * n; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}
