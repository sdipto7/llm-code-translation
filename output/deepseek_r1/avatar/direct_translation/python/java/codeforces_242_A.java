
import java.util.*;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        List<String> games = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            if (i <= b) continue;
            for (int j = b; j <= y; j++) {
                if (i > j) games.add(i + " " + j);
            }
        }
        System.out.println(games.size());
        for (String s : games) System.out.println(s);
    }
}

