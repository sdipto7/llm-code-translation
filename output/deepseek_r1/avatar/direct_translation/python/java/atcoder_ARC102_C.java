
import java.util.*;
import java.io.*;

public class atcoder_ARC102_C {
    static final int mod = 998244353;
    static final int maxN = 8000;
    static long[] g1 = new long[maxN + 1];
    static long[] g2 = new long[maxN + 1];
    static long[] inverse = new long[maxN + 1];
    static long[] pow2 = new long[maxN + 1];

    static {
        g1[0] = 1;
        g1[1] = 1;
        for (int i = 2; i <= maxN; i++) {
            g1[i] = g1[i - 1] * i % mod;
        }
        inverse[1] = 1;
        for (int i = 2; i <= maxN; i++) {
            inverse[i] = (mod - (mod / i) * inverse[mod % i] % mod) % mod;
        }
        g2[0] = 1;
        g2[1] = 1;
        for (int i = 2; i <= maxN; i++) {
            g2[i] = g2[i - 1] * inverse[i] % mod;
        }
        pow2[0] = 1;
        for (int i = 1; i <= maxN; i++) {
            pow2[i] = pow2[i - 1] * 2 % mod;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();

        List<Long> ansList = new ArrayList<>();

        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                long tmp = solve(i, K, N) % mod;
                ansList.add(tmp);
                System.out.println(tmp);
            } else {
                int len = ansList.size();
                int idx = (K - i) % len;
                if (idx < 0) idx += len;
                System.out.println(ansList.get(idx));
            }
        }
    }

    static long cmb(int n, int r, int mod) {
        if (r < 0 || r > n) return 0;
        r = Math.min(r, n - r);
        return g1[n] * g2[r] % mod * g2[n - r] % mod;
    }

    static long kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, mod);
    }

    static long solve(int n, int K, int N) {
        int kumi = (n - 1) / 2;
        long ans = 0;
        for (int p = 0; p <= kumi; p++) {
            if (p > N) break;
            long part1 = pow2[p] * cmb(kumi, p, mod) % mod;
            int tmp = K - 2 * kumi - (n % 2 == 0 ? 1 : 0);
            int q = p + tmp;
            if (N - p >= 0) {
                long term = part1 * kumiawase(N - p, q) % mod;
                ans = (ans + term) % mod;
            }
            if (n % 2 == 0 && N - p - 1 >= 0) {
                long term = part1 * kumiawase(N - p - 1, q) % mod;
                ans = (ans + term) % mod;
            }
        }
        return ans % mod;
    }
}

