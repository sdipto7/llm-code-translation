import java.util.*;
import java.io.*;

public class atcoder_ABC145_E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int[][] timeValue = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            timeValue[i][0] = Integer.parseInt(st.nextToken());
            timeValue[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(timeValue, 1, N + 1, Comparator.comparingInt(a -> a[1]));
        int[][] dp = new int[N + 1][T];
        for (int t = 0; t < T; t++) {
            dp[0][t] = 0;
        }
        for (int n = 1; n <= N; n++) {
            dp[n][0] = 0;
            for (int t = 1; t < T; t++) {
                if (timeValue[n][0] > t) {
                    dp[n][t] = dp[n - 1][t];
                } else {
                    dp[n][t] = Math.max(dp[n - 1][t], timeValue[n][1] + dp[n - 1][t - timeValue[n][0]]);
                }
            }
        }
        int valAcum = timeValue[N][1];
        int t = T - 1;
        int maxVal = valAcum + dp[N - 1][t];
        for (int n = N - 1; n > 0; n--) {
            valAcum += timeValue[n][1];
            t -= timeValue[n + 1][0];
            if (t < 0) {
                break;
            } else {
                maxVal = Math.max(maxVal, valAcum + dp[n - 1][t]);
            }
        }
        System.out.println(maxVal);
    }
}
