
import java.util.*;
import java.io.*;

public class atcoder_ABC145_E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int TIME = 0;
        final int VAL = 1;
        
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int T = Integer.parseInt(firstLine[1]);
        
        int[][] timeValue = new int[N + 1][2];
        timeValue[0][TIME] = -1;
        timeValue[0][VAL] = -1;
        
        for (int i = 1; i <= N; i++) {
            String[] line = br.readLine().split(" ");
            timeValue[i][TIME] = Integer.parseInt(line[0]);
            timeValue[i][VAL] = Integer.parseInt(line[1]);
        }
        
        Arrays.sort(timeValue, 1, N + 1, (a, b) -> Integer.compare(a[VAL], b[VAL]));
        
        int[][] dp = new int[N + 1][T];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], -1);
        }
        
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
        
        for (int n = N - 1; n >= 1; n--) {
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

