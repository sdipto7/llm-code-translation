
import java.util.Scanner;

public class atcoder_ARC102_C {
    static final int MOD = 998244353;
    static final int MAX_N = 8000;
    static long[] g1 = new long[MAX_N + 1];
    static long[] g2 = new long[MAX_N + 1];
    static long[] inverse = new long[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();

        precomputeFactorials();

        long[] ans = new long[K + 1];
        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                long tmp = solve(i, K, N) % MOD;
                ans[i - 2] = tmp;
                System.out.println(tmp);
            } else {
                System.out.println(ans[2 * K - i]);
            }
        }
    }

    static void precomputeFactorials() {
        g1[0] = g1[1] = 1;
        g2[0] = g2[1] = 1;
        inverse[0] = 0;
        inverse[1] = 1;
        for (int i = 2; i <= MAX_N; i++) {
            g1[i] = (g1[i - 1] * i) % MOD;
            inverse[i] = (-inverse[MOD % i] * (MOD / i)) % MOD;
            if (inverse[i] < 0) inverse[i] += MOD;
            g2[i] = (g2[i - 1] * inverse[i]) % MOD;
        }
    }

    static long cmb(int n, int r) {
        if (r < 0 || r > n) return 0;
        r = Math.min(r, n - r);
        return (g1[n] * g2[r]) % MOD * g2[n - r] % MOD;
    }

    static long kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1);
    }

    static long solve(int n, int K, int N) {
        long ans = 0;
        int kumi = (n - 1) / 2;
        for (int p = 0; p <= kumi; p++) {
            if (p > N) break;
            ans = (ans + pow(2, p) * cmb(kumi, p) % MOD * kumiawase(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)))) % MOD;
            if (n % 2 == 0 && N - p - 1 >= 0) {
                ans = (ans + pow(2, p) * cmb(kumi, p) % MOD * kumiawase(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)))) % MOD;
            }
        }
        return ans;
    }

    static long pow(int x, int n) {
        long res = 1;
        long a = x;
        while (n > 0) {
            if ((n & 1) == 1) res = (res * a) % MOD;
            a = (a * a) % MOD;
            n >>= 1;
        }
        return res;
    }
}

