import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        List<int[]> games = new ArrayList<>();

        for (int i = a; i <= x; i++) {
            if (i <= b) {
                continue;
            } else {
                for (int j = b; j <= y; j++) {
                    if (i > j) {
                        games.add(new int[]{i, j});
                    }
                }
            }
        }

        System.out.println(games.size());
        for (int[] game : games) {
            System.out.println(game[0] + " " + game[1]);
        }
    }
}
