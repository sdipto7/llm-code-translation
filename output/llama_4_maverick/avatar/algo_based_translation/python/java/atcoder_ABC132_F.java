
import java.util.Scanner;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long mod = (long) (1e9 + 7);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[] coef = new long[(int) Math.sqrt(n) + n];
        int idx = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef[idx++] = (n / i) - (n / (i + 1));
        }
        while (idx < coef.length && sum(coef, idx) < n) {
            coef[idx++] = 1;
        }
        long[] newCoef = new long[idx];
        System.arraycopy(coef, 0, newCoef, 0, idx);
        reverse(newCoef);
        long[][] dp = new long[k + 1][idx];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = idx - 1; j >= 0; j--) {
                tmp = (tmp + dp[i - 1][idx - 1 - j]) % mod;
                dp[i][j] = (newCoef[j] * tmp) % mod;
            }
        }
        System.out.println(sum(dp[k], idx) % mod);
    }

    private static long sum(long[] array, int length) {
        long sum = 0;
        for (int i = 0; i < length; i++) {
            sum = (sum + array[i]) % (long) (1e9 + 7);
        }
        return sum;
    }

    private static void reverse(long[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            long temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}

