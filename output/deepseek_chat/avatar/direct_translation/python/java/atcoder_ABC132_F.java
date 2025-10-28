
import java.util.Scanner;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = (int)1e9 + 7;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coef = new int[(int)Math.sqrt(n) + 1];
        int idx = 0;
        for (int i = 1; i <= (int)Math.sqrt(n); i++) {
            coef[idx++] = (n / i) - (n / (i + 1));
        }
        int sum = 0;
        for (int num : coef) {
            sum += num;
        }
        int[] temp = new int[n - sum];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = 1;
        }
        int[] finalCoef = new int[coef.length + temp.length];
        System.arraycopy(coef, 0, finalCoef, 0, coef.length);
        System.arraycopy(temp, 0, finalCoef, coef.length, temp.length);
        int nn = finalCoef.length;
        int[][] dp = new int[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][(nn - 1) - j];
                tmp %= mod;
                dp[i][j] = (int)((long)finalCoef[j] * tmp % mod);
            }
        }
        int result = 0;
        for (int num : dp[k]) {
            result = (result + num) % mod;
        }
        System.out.println(result);
    }
}

