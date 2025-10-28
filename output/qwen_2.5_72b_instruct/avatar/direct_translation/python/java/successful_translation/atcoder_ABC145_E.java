
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC145_E {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int TIME = 0;
        int VAL = 1;
        int N = input.nextInt();
        int T = input.nextInt();
        int[][] timeValue = new int[N + 1][2];
        timeValue[0] = new int[]{-1, -1};
        for (int i = 1; i <= N; i++) {
            timeValue[i][TIME] = input.nextInt();
            timeValue[i][VAL] = input.nextInt();
        }
        Arrays.sort(timeValue, (a, b) -> Integer.compare(a[VAL], b[VAL]));
        int[][] dp = new int[N + 1][T];
        for (int t = 0; t < T; t++) {
            dp[0][t] = 0;
        }
        for (int n = 1; n <= N; n++) {
            dp[n][0] = 0;
            for (int t = 1; t < T; t++) {
                if (timeValue[n][TIME] > t) {
                    dp[n][t] = dp[n - 1][t];
                } else {
                    dp[n][t] = Math.max(dp[n - 1][t], timeValue[n][VAL] + dp[n - 1][t - timeValue[n][TIME]]);
                }
            }
        }
        int valAcum = timeValue[N][VAL];
        int t = T - 1;
        int maxVal = valAcum + dp[N - 1][t];
        for (int n = N - 1; n > 0; n--) {
            valAcum += timeValue[n][VAL];
            t -= timeValue[n + 1][TIME];
            if (t < 0) {
                break;
            } else {
                maxVal = Math.max(maxVal, valAcum + dp[n - 1][t]);
            }
        }
        System.out.println(maxVal);
    }
}

