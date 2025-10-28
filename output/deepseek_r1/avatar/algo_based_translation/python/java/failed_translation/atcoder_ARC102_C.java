
import java.util.*;

public class atcoder_ARC102_C {
    private static final int mod = 998244353;
    private static final int __N = 8000;
    private static int[] g1 = new int[__N + 1];
    private static int[] g2 = new int[__N + 1];
    private static int[] inverse = new int[__N + 1];
    private static List<Integer> ans;
    private static int K, N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        K = scanner.nextInt();
        N = scanner.nextInt();
        precompute();
        ans = new ArrayList<>();

        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                int result = solve(i) % mod;
                ans.add(result);
                System.out.println(result);
            } else {
                System.out.println(ans.get(2 * K - i));
            }
        }
    }

    private static void precompute() {
        g1[0] = g1[1] = 1;
        g2[0] = g2[1] = 1;
        inverse[1] = 1;

        for (int i = 2; i <= __N; i++) {
            g1[i] = (int) ((long) g1[i - 1] * i % mod);
            inverse[i] = (int) ((mod - (long) inverse[mod % i] * (mod / i) % mod) % mod);
            g2[i] = (int) ((long) g2[i - 1] * inverse[i] % mod);
        }
    }

    private static int computeCombinations(int n, int r) {
        if (r < 0 || r > n) return 0;
        r = Math.min(r, n - r);
        return (int) ((long) g1[n] * g2[r] % mod * g2[n - r] % mod);
    }

    private static int combWithRepetition(int p, int q) {
        return computeCombinations(p + q - 1, q - 1);
    }

    private static int solve(int n) {
        int kumi = (n - 1) / 2;
        int ansValue = 0;
        int pow2 = 1;

        for (int p = 0; p <= kumi; p++) {
            if (p > N) break;

            int comb = computeCombinations(kumi, p);
            comb = (int) ((long) comb * pow2 % mod);
            int adj = (n % 2 == 0) ? 1 : 0;
            int q = p + (K - 2 * kumi - adj);
            long term1 = (long) comb * combWithRepetition(N - p, q) % mod;
            ansValue = (int) ((ansValue + term1) % mod);

            if (n % 2 == 0 && (N - p - 1) >= 0) {
                int q2 = p + (K - 2 * kumi - 1);
                long term2 = (long) comb * combWithRepetition(N - p - 1, q2) % mod;
                ansValue = (int) ((ansValue + term2) % mod);
            }

            if (p < kumi) pow2 = (pow2 * 2) % mod;
        }
        return ansValue % mod;
    }
}

