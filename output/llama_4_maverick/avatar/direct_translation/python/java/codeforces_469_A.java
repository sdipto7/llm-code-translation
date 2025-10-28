
import java.util.*;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLevel = scanner.nextInt();
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            if (val != 0) x.add(val);
        }

        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            if (val != 0) y.add(val);
        }

        x.addAll(y);

        if (x.size() != maxLevel) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}

