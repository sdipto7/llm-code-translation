
import java.util.Scanner;

public class s790754864 {
    static long mod = (long)1e9 + 7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = N - K;

        for (int i = 1; i <= K; i++) {
            long ans;
            if (N - K + 1 < i) {
                ans = 0;
            } else {
                ans = (fact(R + 1, i) * fact(K - 1, i - 1)) % mod;
            }
            System.out.println(ans);
        }
    }

    static long fact(int n, int r) {
        return comb(n, r);
    }

    static long comb(int n, int r) {
        if (r > n - r) r = n - r;
        long ans = 1;
        for (int i = 0; i < r; i++) {
            ans = (ans * (n - i)) % mod;
            ans = (ans * modInv(i + 1)) % mod;
        }
        return ans;
    }

    static long modInv(long a) {
        return power(a, mod - 2);
    }

    static long power(long x, long y) {
        long res = 1;
        while (y > 0) {
            if ((y & 1) == 1) res = (res * x) % mod;
            y >>= 1;
            x = (x * x) % mod;
        }
        return res;
    }
}

