
import java.util.Scanner;

public class atcoder_ARC102_C {
    static long[] g1 = new long[8001];
    static long[] g2 = new long[8001];
    static long[] inverse = new long[8001];
    static final long mod = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();

        g1[0] = 1;
        g1[1] = 1;
        g2[0] = 1;
        g2[1] = 1;
        inverse[0] = 0;
        inverse[1] = 1;

        for (int i = 2; i <= 8000; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = ((-inverse[(int) (mod % i)] * (mod / i)) % mod + mod) % mod;
            g2[i] = (g2[i - 1] * inverse[i]) % mod;
        }

        long[] ans = new long[K + 1];
        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                long tmp = solve(i, N, K) % mod;
                ans[i - 2] = tmp;
                System.out.println(tmp);
            } else {
                System.out.println(ans[2 * K - i]);
            }
        }
    }

    static long cmb(long n, long r) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return (g1[(int) n] * g2[(int) r] % mod * g2[(int) (n - r)]) % mod;
    }

    static long kumiawase(long p, long q) {
        return cmb(p + q - 1, q - 1);
    }

    static long solve(int n, int N, int K) {
        assert n <= K + 1;
        long ans = 0;
        int kumi = (n - 1) / 2;
        for (int p = 0; p <= kumi; p++) {
            if (p > N) {
                break;
            }
            ans = (ans + (long) Math.pow(2, p) * cmb(kumi, p) % mod * kumiawase(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)))) % mod;
            if (n % 2 == 0 && N - p - 1 >= 0) {
                ans = (ans + (long) Math.pow(2, p) * cmb(kumi, p) % mod * kumiawase(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)))) % mod;
            }
        }
        return ans;
    }
}

