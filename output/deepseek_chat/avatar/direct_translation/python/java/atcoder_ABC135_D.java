
import java.util.*;
import java.io.*;

public class atcoder_ABC135_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int n = S.length();
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
                if (S.charAt(i) != '?') {
                    dp[i][S.charAt(i) - '0']++;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[i][j]++;
                    }
                }
            } else {
                if (S.charAt(i) != '?') {
                    for (int k = 0; k < 13; k++) {
                        dp[i][(k * 10 + (S.charAt(i) - '0')) % 13] += dp[i - 1][k];
                        dp[i][(k * 10 + (S.charAt(i) - '0')) % 13] %= 1000000007;
                    }
                } else {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 13; k++) {
                            dp[i][(k * 10 + j) % 13] += dp[i - 1][k];
                            dp[i][(k * 10 + j) % 13] %= 1000000007;
                        }
                    }
                }
            }
        }
        System.out.println(dp[n - 1][5]);
    }
}

