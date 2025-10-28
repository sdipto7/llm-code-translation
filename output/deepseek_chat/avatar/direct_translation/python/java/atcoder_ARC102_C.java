





import java.util.*;

public class atcoder_ARC102_C {
    private static int K, N;
    private static final int MOD = 998244353;
    private static final int __N = 8000;
    private static int[] g1 = new int[__N + 2];
    private static int[] g2 = new int[__N + 2];
    private static int[] inverse = new int[__N + 2];

    static {
        g1[0] = 1;
        g1[1] = 1;
        g2[0] = 1;
        g2[1] = 1;
        inverse[1] = 1;
        for (int i = 2; i <= __N; i++) {
            g1[i] = (int)((long)g1[i - 1] * i % MOD);
            inverse[i] = (int)((-(long)inverse[MOD % i] * (MOD / i) % MOD + MOD) % MOD);
            g2[i] = (int)((long)g2[i - 1] * inverse[i] % MOD);
        }
    }

    private static int cmb(int n, int r, int mod) {
        if (r < 0 || r > n) return 0;
        r = Math.min(r, n - r);
        return (int)((long)g1[n] * g2[r] % MOD * g2[n - r] % MOD);
    }

    private static int kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, MOD);
    }

    private static int solve(int n) {
        int ans = 0;
        int kumi = (n - 1) / 2;
        for (int p = 0; p <= kumi; p++) {
            if (p > N) break;
            ans = (int)((ans + (long)Math.pow(2, p) * cmb(kumi, p, MOD) % MOD * kumiawase(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0))) % MOD) % MOD);
            if (n % 2 == 0 && N - p - 1 >= 0) {
                ans = (int)((ans + (long)Math.pow(2, p) * cmb(kumi, p, MOD) % MOD * kumiawase(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0))) % MOD) % MOD);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();
        List<Integer> ans = new ArrayList<>();
        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                int tmp = solve(i) % MOD;
                ans.add(tmp);
                System.out.println(tmp);
            } else {
                System.out.println(ans.get(ans.size() - (i - K)));
            }
        }
    }
}
