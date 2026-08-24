import java.util.*;

public class Week_3_Session_13_01_Java_Priority_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) pq.offer(sc.nextInt());
        while (!pq.isEmpty()) System.out.print(pq.poll() + " ");
        System.out.println();
        sc.close();
    }
}
