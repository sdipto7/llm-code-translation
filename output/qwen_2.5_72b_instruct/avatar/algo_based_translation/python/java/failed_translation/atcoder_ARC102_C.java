
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ARC102_C {
    static int mod = 998244353;
    static int __N = 8000;
    static List<Integer> g1 = new ArrayList<>();
    static List<Integer> g2 = new ArrayList<>();
    static List<Integer> inverse = new ArrayList<>();
    static List<Integer> ans = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.close();

        dprint();

        g1.add(1);
        g1.add(1);
        g2.add(1);
        g2.add(1);
        inverse.add(0);
        inverse.add(1);

        for (int i = 2; i <= __N; i++) {
            g1.add((g1.get(g1.size() - 1) * i) % mod);
            inverse.add((-inverse.get(mod % i) * (mod / i)) % mod);
            g2.add((g2.get(g2.size() - 1) * inverse.get(inverse.size() - 1)) % mod);
        }

        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                int tmp = solve(i) % mod;
                ans.add(tmp);
                System.out.println(tmp);
            } else {
                System.out.println(ans.get(ans.size() - i + K));
            }
        }
    }

    static void dprint(Object... x) {
    }

    static int cmb(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return (int) ((long) g1.get(n) * g2.get(r) % mod * g2.get(n - r) % mod);
    }

    static int kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, mod);
    }

    static int solve(int n) {
        assert n <= K + 1;
        int ans = 0;
        int kumi = (n - 1) / 2;
        for (int p = 0; p <= kumi; p++) {
            if (p > N) {
                break;
            }
            ans += (int) ((long) Math.pow(2, p) * cmb(kumi, p, mod) % mod * kumiawase(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0))) % mod);
            if (n % 2 == 0 && N - p - 1 >= 0) {
                ans += (int) ((long) Math.pow(2, p) * cmb(kumi, p, mod) % mod * kumiawase(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0))) % mod);
            }
        }
        return ans;
    }
}

