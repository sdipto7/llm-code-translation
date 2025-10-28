
import java.util.Scanner;
import java.util.ArrayList;

public class s793709854 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] time = new int[N];
        int[] value = new int[N];
        for (int i = 0; i < N; i++) {
            time[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        int[][] dp = new int[N + 1][T];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < T; j++) {
                if (j < time[i]) {
                    dp[i + 1][j] = dp[i][j];
                } else {
                    dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - time[i]] + value[i]);
                }
            }
        }
        int B = dp[N][T - 1];
        int currentTime = T - 1;
        ArrayList<Integer> used = new ArrayList<>();
        for (int i = N - 1; i >= 0; i--) {
            if (B == dp[i][currentTime]) continue;
            used.add(i);
            B -= value[i];
            currentTime -= time[i];
        }
        int ans = dp[N][T - 1];
        int maxUnused = 0;
        for (int i = 0; i < N; i++) {
            if (!used.contains(i)) {
                maxUnused = Math.max(maxUnused, value[i]);
            }
        }
        System.out.println(ans + maxUnused);
    }
}

