
import java.util.Scanner;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        final int mod = 1000000007;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        int[] coef = new int[(int) Math.sqrt(n)];
        for (int i = 1; i <= coef.length; i++) {
            coef[i - 1] = (n / i) - (n / (i + 1));
        }
        int remaining = n - sumArray(coef);
        int[] extendedCoef = new int[coef.length + remaining];
        System.arraycopy(coef, 0, extendedCoef, 0, coef.length);
        for (int i = coef.length; i < extendedCoef.length; i++) {
            extendedCoef[i] = 1;
        }
        int nn = extendedCoef.length;
        int[][] dp = new int[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][nn - 1 - j];
                tmp %= mod;
                dp[i][j] = (int) ((long) extendedCoef[j] * tmp % mod);
            }
        }
        System.out.println(sumArray(dp[k]) % mod);
    }

    private static int sumArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
            sum %= 1000000007;
        }
        return sum;
    }
}

