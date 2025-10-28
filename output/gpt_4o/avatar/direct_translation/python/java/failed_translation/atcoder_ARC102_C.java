
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ARC102_C {
    static final int MOD = 998244353;
    static final int __N = 8000;
    static long[] g1 = new long[__N + 1];
    static long[] g2 = new long[__N + 1];
    static long[] inverse = new long[__N + 1];
    static int K, N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        K = scanner.nextInt();
        N = scanner.nextInt();
        scanner.close();
        
        g1[0] = g1[1] = 1;
        g2[0] = g2[1] = 1;
        inverse[1] = 1;

        for (int i = 2; i <= __N; i++) {
            g1[i] = g1[i - 1] * i % MOD;
            inverse[i] = (-inverse[MOD % i] * (MOD / i) % MOD + MOD) % MOD;
            g2[i] = g2[i - 1] * inverse[i] % MOD;
        }

        List<Long> ans = new ArrayList<>();
        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                long tmp = solve(i) % MOD;
                ans.add(tmp);
                System.out.println(tmp);
            } else {
                System.out.println(ans.get(-i + K));
            }
        }
    }

    static long cmb(int n, int r, int mod) {
        if (r < 0 || r > n) return 0;
        r = Math.min(r, n - r);
        return g1[n] * g2[r] % mod * g2[n - r] % mod;
    }

    static long kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, MOD);
    }

    static long solve(int n) {
        assert n <= K + 1;
        long ans = 0;
        int kumi = (n - 1) / 2;
        for (int p = 0; p <= kumi; p++) {
            if (p > N) break;
            ans = (ans + (1L << p) * cmb(kumi, p, MOD) % MOD * kumiawase(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0))) % MOD) % MOD;
            if (n % 2 == 0 && N - p - 1 >= 0) {
                ans = (ans + (1L << p) * cmb(kumi, p, MOD) % MOD * kumiawase(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0))) % MOD) % MOD;
            }
        }
        return ans;
    }
}

