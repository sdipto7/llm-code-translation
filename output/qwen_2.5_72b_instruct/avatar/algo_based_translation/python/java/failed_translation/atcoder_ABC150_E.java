
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        int mod = 1000000007;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(c);
        for (int i = 0; i < n / 2; i++) {
            int temp = c[i];
            c[i] = c[n - i - 1];
            c[n - i - 1] = temp;
        }
        long b = powerMod(2, 2 * n - 2, mod);
        long a = (2 * b) % mod;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (long) c[i] * (a + (long) i * b);
            ans %= mod;
        }
        System.out.println(ans);
    }

    private static long powerMod(long base, long exp, long mod) {
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            exp >>= 1;
            base = (base * base) % mod;
        }
        return result;
    }
}

