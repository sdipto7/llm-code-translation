
import java.util.Scanner;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mod = 1000000007;
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        
        java.util.List<Integer> coef = new java.util.ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef.add((n / i) - (n / (i + 1)));
        }
        for (int i = 0; i < n - coef.stream().mapToInt(Integer::intValue).sum(); i++) {
            coef.add(1);
        }
        java.util.Collections.reverse(coef);
        
        int nn = coef.size();
        long[][] dp = new long[k + 1][nn];
        dp[0][0] = 1;
        
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][(nn - 1) - j];
                tmp %= mod;
                dp[i][j] = coef.get(j) * tmp;
                dp[i][j] %= mod;
            }
        }
        
        long result = 0;
        for (int j = 0; j < nn; j++) {
            result += dp[k][j];
            result %= mod;
        }
        
        System.out.println(result);
    }
}

