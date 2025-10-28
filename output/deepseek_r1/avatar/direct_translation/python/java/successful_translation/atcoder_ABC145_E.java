
import java.util.*;

public class atcoder_ABC145_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[][] timeValue = new int[N + 1][2];
        timeValue[0][0] = -1;
        timeValue[0][1] = -1;
        for (int i = 1; i <= N; i++) {
            timeValue[i][0] = sc.nextInt();
            timeValue[i][1] = sc.nextInt();
        }
        Arrays.sort(timeValue, 1, N + 1, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]);
            }
        });
        int[][] dp = new int[N + 1][T];
        for (int n = 1; n <= N; n++) {
            for (int t = 1; t < T; t++) {
                if (timeValue[n][0] > t) {
                    dp[n][t] = dp[n - 1][t];
                } else {
                    int take = timeValue[n][1] + dp[n - 1][t - timeValue[n][0]];
                    dp[n][t] = Math.max(dp[n - 1][t], take);
                }
            }
        }
        int valAcum = timeValue[N][1];
        int tRemaining = T - 1;
        int maxVal = valAcum + dp[N - 1][tRemaining];
        for (int n = N - 1; n >= 1; n--) {
            valAcum += timeValue[n][1];
            tRemaining -= timeValue[n + 1][0];
            if (tRemaining < 0) break;
            maxVal = Math.max(maxVal, valAcum + dp[n - 1][tRemaining]);
        }
        System.out.println(maxVal);
    }
}

