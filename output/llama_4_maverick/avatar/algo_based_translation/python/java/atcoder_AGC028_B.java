
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class atcoder_AGC028_B {
    static final int MOD = (int) (1e9 + 7);
    static final int M = (int) 1e6;
    static final int Nsq = (int) 1e3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] A = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        long[][] fact = new long[Nsq][Nsq];
        for (int i = 0; i < Nsq; i++) {
            for (int j = 0; j < Nsq; j++) {
                fact[i][j] = (long) (i * Nsq + j);
            }
        }
        fact[0][0] = 1;
        for (int n = 1; n < Nsq; n++) {
            for (int i = 0; i < Nsq; i++) {
                fact[i][n] = fact[i][n] * fact[i][n - 1] % MOD;
            }
        }
        for (int n = 1; n < Nsq; n++) {
            fact[n][0] = fact[n][0] * fact[n - 1][Nsq - 1] % MOD;
            for (int j = 1; j < Nsq; j++) {
                fact[n][j] = fact[n][j] * fact[n][0] % MOD;
            }
        }
        long[] fact1d = new long[M];
        int idx = 0;
        for (int i = 0; i < Nsq; i++) {
            for (int j = 0; j < Nsq; j++) {
                fact1d[idx++] = fact[i][j];
                if (idx == M) break;
            }
            if (idx == M) break;
        }

        long[] inv = new long[N];
        inv[0] = modInverse(1, MOD);
        for (int i = 1; i < N; i++) {
            inv[i] = (inv[i - 1] + modInverse(i + 1, MOD)) % MOD;
        }

        long[] j = new long[N];
        for (int i = 0; i < N; i++) j[i] = i;

        long[] temp = new long[N];
        for (int i = 0; i < N; i++) {
            temp[i] = (inv[(int) j[i]] + inv[N - 1 - (int) j[i]] - 1 + MOD) % MOD;
        }

        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans = (ans + A[i] * temp[i]) % MOD;
        }

        ans = ans * fact1d[N] % MOD;
        System.out.println(ans);
    }

    static long modInverse(long a, long m) {
        long m0 = m;
        long y = 0, x = 1;
        if (m == 1) return 0;
        while (a > 1) {
            long q = a / m;
            long t = m;
            m = a % m;
            a = t;
            t = y;
            y = x - q * y;
            x = t;
        }
        if (x < 0) x += m0;
        return x;
    }
}

