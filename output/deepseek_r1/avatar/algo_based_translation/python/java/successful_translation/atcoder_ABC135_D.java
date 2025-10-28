
import java.io.*;

public class atcoder_ABC135_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().trim();
        int n = S.length();
        int mod = 1000000007;

        if (n == 1) {
            char c = S.charAt(0);
            if (c == '5' || c == '?') {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            return;
        }

        int[][] dp = new int[n][13];
        char firstChar = S.charAt(0);
        if (firstChar != '?') {
            int d = Character.getNumericValue(firstChar);
            dp[0][d % 13] = 1;
        } else {
            for (int j = 0; j < 10; j++) {
                dp[0][j % 13]++;
            }
        }

        for (int i = 1; i < n; i++) {
            char c = S.charAt(i);
            if (c != '?') {
                int d = Character.getNumericValue(c);
                for (int k = 0; k < 13; k++) {
                    int newRem = (k * 10 + d) % 13;
                    dp[i][newRem] = (dp[i][newRem] + dp[i - 1][k]) % mod;
                }
            } else {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 13; k++) {
                        int newRem = (k * 10 + j) % 13;
                        dp[i][newRem] = (dp[i][newRem] + dp[i - 1][k]) % mod;
                    }
                }
            }
        }

        System.out.println(dp[n - 1][5] % mod);
    }
}

