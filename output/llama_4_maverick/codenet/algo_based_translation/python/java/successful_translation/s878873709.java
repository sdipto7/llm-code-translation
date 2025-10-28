
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class s878873709 {
    private static final int MOD = (int) (1e9 + 7);
    private static final double INF = Double.POSITIVE_INFINITY;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Set<Integer> s = new HashSet<>();
        s.add(1); s.add(2); s.add(4); s.add(8); s.add(16); s.add(32); s.add(64);
        int ans = 0;

        for (int i = 1; i <= N; i++) {
            if (s.contains(i)) {
                ans = i;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}

