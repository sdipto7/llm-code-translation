
import java.util.Scanner;

public class atcoder_ABC132_F {

    public static int calculateSumOfWays(int n, int k) {
        int mod = 1000000007;
        int[] coef = new int[(int) Math.sqrt(n) + 1];
        int index = 0;
        
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            coef[index++] = (n / i) - (n / (i + 1));
        }
        
        int totalSum = 0;
        for (int i = 0; i < index; i++) {
            totalSum += coef[i];
        }
        
        int remaining = n - totalSum;
        int[] fullCoef = new int[index + remaining];
        System.arraycopy(coef, 0, fullCoef, 0, index);
        
        for (int i = index; i < fullCoef.length; i++) {
            fullCoef[i] = 1;
        }

        int nn = fullCoef.length;
        int[][] dp = new int[k + 1][nn];
        dp[0][0] = 1;
        
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][(nn - 1) - j];
                tmp %= mod;
                dp[i][j] = (int)((long) fullCoef[j] * tmp % mod);
            }
        }
        
        int result = 0;
        for (int j = 0; j < nn; j++) {
            result += dp[k][j];
            result %= mod;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        
        int result = calculateSumOfWays(n, k);
        System.out.println(result);
    }
}

