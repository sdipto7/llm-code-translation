
import java.util.Scanner;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int n = S.length();
        long mod = (long) (1e9 + 7);

        if (n == 1) {
            if (S.equals("5") || S.equals("?")) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            return;
        }

        long[][] dp = new long[n][13];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (!S.charAt(i) == '?') {
                    dp[i][S.charAt(i) - '0'] = 1;
                } else {
                    for (int j = 0; j <= 9; j++) {
                        dp[i][j] = 1;
                    }
                }
            } else {
                if (S.charAt(i) != '?') {
                    for (int k = 0; k <= 12; k++) {
                        dp[i][(k * 10 + S.charAt(i) - '0') % 13] = (dp[i][(k * 10 + S.charAt(i) - '0') % 13] + dp[i - 1][k]) % mod;
                    }
                } else {
                    for (int j = 0; j <= 9; j++) {
                        for (int k = 0; k <= 12; k++) {
                            dp[i][(k * 10 + j) % 13] = (dp[i][(k * 10 + j) % 13] + dp[i - 1][k]) % mod;
                        }
                    }
                }
            }
        }
        System.out.println(dp[n - 1][5]);
    }
}

