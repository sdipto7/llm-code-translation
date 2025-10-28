
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        List<int[]> games = new ArrayList<>();
        
        for (int i = a; i <= x; i++) {
            if (i <= b) {
                continue;
            }
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    games.add(new int[]{i, j});
                }
            }
        }
        
        System.out.println(games.size());
        for (int[] pair : games) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}

