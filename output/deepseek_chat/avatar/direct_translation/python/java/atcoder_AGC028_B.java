import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class atcoder_AGC028_B {
    static final long MOD = 1000000007;
    static int N;
    static long[] A;
    static int M = 1000000;
    static int Nsq = 1000;
    static long[] fact;
    static long[] inv;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        fact = new long[M];
        for (int i = 0; i < M; i++) fact[i] = i;
        fact[0] = 1;
        for (int n = 1; n < Nsq; n++) {
            for (int i = 0; i < Nsq; i++) {
                fact[i * Nsq + n] = fact[i * Nsq + n] * fact[i * Nsq + n - 1] % MOD;
            }
        }
        for (int n = 1; n < Nsq; n++) {
            for (int i = 0; i < Nsq; i++) {
                fact[n * Nsq + i] = fact[n * Nsq + i] * fact[(n - 1) * Nsq + Nsq - 1] % MOD;
            }
        }
        inv = new long[N];
        for (int i = 0; i < N; i++) {
            inv[i] = pow(i + 1, MOD - 2);
        }
        for (int i = 1; i < N; i++) {
            inv[i] = (inv[i] + inv[i - 1]) % MOD;
        }
        long[] temp = new long[N];
        for (int j = 0; j < N; j++) {
            temp[j] = (inv[j] + inv[N - 1 - j] - 1) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans = (ans + A[i] * temp[i]) % MOD;
        }
        ans = ans * fact[N] % MOD;
        System.out.println(ans);
    }

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }
}
