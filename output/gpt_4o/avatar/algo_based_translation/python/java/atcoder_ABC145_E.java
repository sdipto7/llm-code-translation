
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class atcoder_ABC145_E {
    public static void main(String[] args) {
        final int TIME = 0;
        final int VAL = 1;

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();

        Tuple[] timeValue = new Tuple[N + 1];
        timeValue[0] = new Tuple(-1, -1);

        for (int i = 1; i <= N; i++) {
            int time = scanner.nextInt();
            int value = scanner.nextInt();
            timeValue[i] = new Tuple(time, value);
        }

        Arrays.sort(timeValue, 1, N + 1, Comparator.comparingInt(t -> t.value));

        int[][] dp = new int[N + 1][T];
        for (int t = 0; t < T; t++) {
            dp[0][t] = 0;
        }

        for (int n = 1; n <= N; n++) {
            dp[n][0] = 0;
            for (int t = 1; t < T; t++) {
                if (timeValue[n].time > t) {
                    dp[n][t] = dp[n - 1][t];
                } else {
                    dp[n][t] = Math.max(dp[n - 1][t], timeValue[n].value + dp[n - 1][t - timeValue[n].time]);
                }
            }
        }

        int valAcum = timeValue[N].value;
        int t = T - 1;
        int maxVal = valAcum + dp[N - 1][t];

        for (int n = N - 1; n > 0; n--) {
            valAcum += timeValue[n].value;
            t -= timeValue[n + 1].time;
            if (t < 0) {
                break;
            } else {
                maxVal = Math.max(maxVal, valAcum + dp[n - 1][t]);
            }
        }

        System.out.println(maxVal);
    }

    static class Tuple {
        int time, value;

        Tuple(int time, int value) {
            this.time = time;
            this.value = value;
        }
    }
}

