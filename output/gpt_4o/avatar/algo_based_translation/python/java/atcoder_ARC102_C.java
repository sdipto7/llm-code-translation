
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ARC102_C {
    static final int mod = 998244353;
    static final int __N = 8000;
    static List<Long> g1 = new ArrayList<>();
    static List<Long> g2 = new ArrayList<>();
    static List<Long> inverse = new ArrayList<>();
    static int K, N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        K = scanner.nextInt();
        N = scanner.nextInt();

        // Initialize lists
        g1.add(1L);
        g1.add(1L);
        g2.add(1L);
        g2.add(1L);
        inverse.add(0L);
        inverse.add(1L);

        // Precompute factorials and modular inverses
        for (int i = 2; i <= __N; i++) {
            g1.add(g1.get(i - 1) * i % mod);
            inverse.add((-inverse.get((int) (mod % i)) * (mod / i)) % mod);
            g2.add(g2.get(i - 1) * inverse.get(i) % mod);
        }

        List<Long> ans = new ArrayList<>();
        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                long tmp = solve(i) % 998244353;
                ans.add(tmp);
                System.out.println(tmp);
            } else {
                System.out.println(ans.get(-i + K));
            }
        }
    }

    static long cmb(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return g1.get(n) * g2.get(r) % mod * g2.get(n - r) % mod;
    }

    static long kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, mod);
    }

    static long solve(int n) {
        assert n <= K + 1;
        long ans = 0;
        int kumi = (n - 1) / 2;
        for (int p = 0; p <= kumi; p++) {
            if (p > N) {
                break;
            }
            ans += Math.pow(2, p) * cmb(kumi, p, mod) * kumiawase(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
            if (n % 2 == 0 && N - p - 1 >= 0) {
                ans += Math.pow(2, p) * cmb(kumi, p, mod) * kumiawase(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
            }
            ans %= mod;
        }
        return ans;
    }
}

