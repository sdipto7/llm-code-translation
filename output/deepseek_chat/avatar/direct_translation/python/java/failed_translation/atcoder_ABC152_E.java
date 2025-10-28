import java.util.*;
import java.math.*;

public class atcoder_ABC152_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = (int)1e9 + 7;
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        long lcm = 1;
        for (int a : A) {
            lcm = lcm * a / gcd(lcm, a);
        }
        long sum = 0;
        for (int a : A) {
            sum = (sum + pow(a, MOD - 2, MOD)) % MOD;
        }
        long ans = (lcm % MOD) * sum % MOD;
        System.out.println((int)(ans % MOD));
    }

    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static long pow(long a, long b, long mod) {
        long result = 1;
        a = a % mod;
        while (b > 0) {
            if (b % 2 == 1) {
                result = result * a % mod;
            }
            a = a * a % mod;
            b = b >> 1;
        }
        return result;
    }
}
