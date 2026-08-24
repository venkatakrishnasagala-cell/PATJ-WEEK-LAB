import java.util.*;

public class Week_3_Session_14_01_Largest_Number {
    public static String largestNumber(int[] nums) {
        String[] a = new String[nums.length];
        for (int i = 0; i < nums.length; i++) a[i] = String.valueOf(nums[i]);
        Arrays.sort(a, (x, y) -> (y + x).compareTo(x + y));
        if (a[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for (String s : a) sb.append(s);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println(largestNumber(a));
        sc.close();
    }
}
