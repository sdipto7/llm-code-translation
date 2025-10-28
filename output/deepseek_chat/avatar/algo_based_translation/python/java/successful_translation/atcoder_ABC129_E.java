
import java.util.Scanner;

public class atcoder_ABC129_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        int n = l.length();
        int mod = 1000000007;
        int[][] dp = new int[n + 1][2];
        dp[0][0] = 1;
        dp[0][1] = 0;
        
        for (int i = 0; i < n; i++) {
            char c = l.charAt(i);
            if (c == '0') {
                dp[i + 1][0] = (dp[i + 1][0] + dp[i][0]) % mod;
                dp[i + 1][1] = (dp[i + 1][1] + (int)(((long)dp[i][1] * 3) % mod)) % mod;
            } else {
                dp[i + 1][0] = (dp[i + 1][0] + (int)(((long)dp[i][0] * 2) % mod)) % mod;
                dp[i + 1][1] = (dp[i + 1][1] + dp[i][0]) % mod;
                dp[i + 1][1] = (dp[i + 1][1] + (int)(((long)dp[i][1] * 3) % mod)) % mod;
            }
        }
        
        int result = (dp[n][0] + dp[n][1]) % mod;
        System.out.println(result);
    }
}

