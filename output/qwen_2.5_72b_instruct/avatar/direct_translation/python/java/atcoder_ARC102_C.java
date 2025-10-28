
import java.util.Scanner;

public class atcoder_ARC102_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int mod = 998244353;
        int __N = 8000;
        long[] g1 = new long[__N + 1];
        long[] g2 = new long[__N + 1];
        long[] inverse = new long[__N + 1];
        g1[0] = 1;
        g1[1] = 1;
        g2[0] = 1;
        g2[1] = 1;
        inverse[0] = 0;
        inverse[1] = 1;
        for (int i = 2; i <= __N; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = ((-inverse[mod % i] * (mod / i)) % mod + mod) % mod;
            g2[i] = (g2[i - 1] * inverse[i]) % mod;
        }
        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                long tmp = solve(i, K, N, mod, g1, g2) % mod;
                System.out.println(tmp);
            } else {
                System.out.println(ans.get(ans.size() - i + K));
            }
        }
    }

    static long cmb(int n, int r, int mod, long[] g1, long[] g2) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return (g1[n] * g2[r] % mod * g2[n - r] % mod) % mod;
    }

    static long kumiawase(int p, int q, int mod, long[] g1, long[] g2) {
        return cmb(p + q - 1, q - 1, mod, g1, g2);
    }

    static long solve(int n, int K, int N, int mod, long[] g1, long[] g2) {
        assert n <= K + 1;
        long ans = 0;
        int kumi = (n - 1) / 2;
        for (int p = 0; p <= kumi; p++) {
            if (p > N) {
                break;
            }
            ans += (1L << p) * cmb(kumi, p, mod, g1, g2) * kumiawase(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)), mod, g1, g2) % mod;
            if (n % 2 == 0 && N - p - 1 >= 0) {
                ans += (1L << p) * cmb(kumi, p, mod, g1, g2) * kumiawase(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)), mod, g1, g2) % mod;
            }
        }
        return ans % mod;
    }
}

