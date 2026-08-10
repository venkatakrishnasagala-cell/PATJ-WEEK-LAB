import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {

    public int compare(Player a, Player b) {
        if (a.score > b.score) {
            return -1;
        }

        if (a.score < b.score) {
            return 1;
        }

        return a.name.compareTo(b.name);
    }
}

public class JavaComparator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();

            players[i] = new Player(name, score);
        }

        Arrays.sort(players, new Checker());

        for (int i = 0; i < n; i++) {
            System.out.println(players[i].name + " " + players[i].score);
        }

        scanner.close();
    }
}