
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class codeforces_500_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(scanner.nextInt());
        }
        int currentCell = 0;
        while (currentCell <= t) {
            currentCell += s.get(currentCell - 1);
            if (currentCell == t) {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}

