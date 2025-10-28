
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        final int MOD = 1000000007;

        ArrayList<Integer> coef = new ArrayList<>();
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            coef.add((n / i) - (n / (i + 1)));
        }
        int sumCoef = 0;
        for (int c : coef) {
            sumCoef += c;
        }
        int residual = n - sumCoef;
        for (int i = 0; i < residual; i++) {
            coef.add(1);
        }
        Collections.reverse(coef);
        int nn = coef.size();

        long[][] dp = new long[k + 1][nn];
        dp[0][0] = 1;

        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                int prevIndex = (nn - 1) - j;
                tmp = (tmp + dp[i - 1][prevIndex]) % MOD;
                dp[i][j] = (coef.get(j) * tmp) % MOD;
            }
        }

        long result = 0;
        for (long num : dp[k]) {
            result = (result + num) % MOD;
        }
        System.out.println(result);
    }
}

