
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mod = 1000000007;
        int n = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        Arrays.sort(c);
        for (int i = 0; i < n / 2; i++) {
            int temp = c[i];
            c[i] = c[n - i - 1];
            c[n - i - 1] = temp;
        }
        long b = power(2, 2 * n - 2, mod);
        long a = (2 * b) % mod;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (c[i] * ((a + (i * b) % mod) % mod)) % mod;
            ans %= mod;
        }
        System.out.println(ans);
    }

    public static long power(long x, long y, long mod) {
        long result = 1;
        x = x % mod;
        while (y > 0) {
            if ((y & 1) == 1) {
                result = (result * x) % mod;
            }
            y = y >> 1;
            x = (x * x) % mod;
        }
        return result;
    }
}

