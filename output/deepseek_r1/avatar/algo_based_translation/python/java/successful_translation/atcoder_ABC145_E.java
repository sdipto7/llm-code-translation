
import java.util.*;
import java.io.*;

public class atcoder_ABC145_E {
    static class Pair {
        int time;
        int value;
        Pair(int time, int value) {
            this.time = time;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        Pair[] timeValue = new Pair[N + 1];
        timeValue[0] = new Pair(-1, -1);
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            timeValue[i] = new Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(timeValue, 1, N + 1, Comparator.comparingInt(p -> p.value));

        int[][] dp = new int[N + 1][T];
        for (int[] row : dp) Arrays.fill(row, -1);
        for (int t = 0; t < T; t++) dp[0][t] = 0;
        for (int n = 1; n <= N; n++) dp[n][0] = 0;

        for (int n = 1; n <= N; n++) {
            for (int t = 1; t < T; t++) {
                if (timeValue[n].time > t) {
                    dp[n][t] = dp[n - 1][t];
                } else {
                    int prev = t - timeValue[n].time;
                    dp[n][t] = Math.max(dp[n - 1][t], timeValue[n].value + dp[n - 1][prev]);
                }
            }
        }

        int valAcum = timeValue[N].value;
        int tRemaining = T - 1;
        int maxVal = valAcum + dp[N - 1][tRemaining];

        for (int n = N - 1; n >= 1; n--) {
            valAcum += timeValue[n].value;
            tRemaining -= timeValue[n + 1].time;
            if (tRemaining < 0) break;
            maxVal = Math.max(maxVal, valAcum + dp[n - 1][tRemaining]);
        }

        System.out.println(maxVal);
    }
}

