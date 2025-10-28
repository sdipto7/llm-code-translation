
import java.util.Scanner;

public class atcoder_AGC046_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        final int MOD = 998244353;
        int[][] dp = new int[C + 1][D + 1];
        dp[A][B] = 1;
        
        for (int i = A; i <= C; i++) {
            for (int j = B; j <= D; j++) {
                if (i == A && j == B) continue;
                
                long term = 0;
                if (j > B) term += (long) dp[i][j - 1] * i;
                if (i > A) term += (long) dp[i - 1][j] * j;
                if (i > A && j > B) term -= (long) dp[i - 1][j - 1] * (i - 1) * (j - 1);
                
                term %= MOD;
                if (term < 0) term += MOD;
                dp[i][j] = (int) (term % MOD);
            }
        }
        
        System.out.println(dp[C][D]);
    }
}

