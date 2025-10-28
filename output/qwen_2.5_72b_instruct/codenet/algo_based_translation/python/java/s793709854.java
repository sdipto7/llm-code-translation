import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s793709854 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        List<List<Integer>> L = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            List<Integer> item = new ArrayList<>();
            item.add(scanner.nextInt());
            item.add(scanner.nextInt());
            L.add(item);
        }
        int[][] dp = new int[N + 1][T];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < T; j++) {
                if (j < L.get(i).get(0)) {
                    dp[i + 1][j] = dp[i][j];
                } else {
                    dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - L.get(i).get(0)] + L.get(i).get(1));
                }
            }
        }
        List<Integer> used = new ArrayList<>();
        int B = dp[N][T - 1];
        int j = T - 1;
        for (int i = N - 1; i >= 0; i--) {
            if (B == dp[i][j]) {
                continue;
            }
            B -= L.get(i).get(1);
            used.add(i);
            j -= L.get(i).get(0);
        }
        int ans = dp[N][T - 1];
        int c = 0;
        for (int i = 0; i < N; i++) {
            if (used.contains(i)) {
                continue;
            }
            c = Math.max(c, L.get(i).get(1));
        }
        System.out.println(ans + c);
    }
}
