
import java.util.Scanner;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mod = (int) (1e9 + 7);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[] coef = new long[n + 1];
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef[i] = (n / i) - (n / (i + 1));
        }
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            sum += coef[i];
        }
        int idx = (int) Math.sqrt(n) + 1;
        for (int i = sum + 1; i <= n; i++) {
            coef[i] = 1;
        }
        int nn = n;
        long[][] dp = new long[k + 1][nn + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = nn; j >= 0; j--) {
                tmp += dp[i - 1][nn - j];
                tmp %= mod;
                dp[i][j] = (coef[j] * tmp) % mod;
            }
        }
        long sum_dp_k = 0;
        for (int i = 0; i <= nn; i++) {
            sum_dp_k += dp[k][i];
            sum_dp_k %= mod;
        }
        System.out.println(sum_dp_k);
    }
}

