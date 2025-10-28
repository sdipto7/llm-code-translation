
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class atcoder_AGC028_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final long MOD = 1000000007;
        int N = Integer.parseInt(br.readLine().trim());
        int M = 1000000;
        long[] A = Arrays.stream(br.readLine().trim().split(" ")).mapToLong(Long::parseLong).toArray();
        int Nsq = 1000;
        long[][] fact = new long[Nsq][Nsq];
        for (int i = 0; i < Nsq; i++) {
            for (int j = 0; j < Nsq; j++) {
                fact[i][j] = i * Nsq + j;
            }
        }
        fact[0][0] = 1;
        for (int n = 1; n < Nsq; n++) {
            for (int i = 0; i < Nsq; i++) {
                fact[i][n] = fact[i][n] * fact[i][n - 1] % MOD;
            }
        }
        for (int n = 1; n < Nsq; n++) {
            for (int i = 0; i < Nsq; i++) {
                fact[n][i] = fact[n][i] * fact[n - 1][Nsq - 1] % MOD;
            }
        }
        long[] factFlat = new long[M];
        for (int i = 0; i < Nsq; i++) {
            System.arraycopy(fact[i], 0, factFlat, i * Nsq, Nsq);
        }
        long[] j = new long[N];
        for (int i = 0; i < N; i++) {
            j[i] = i;
        }
        long[] inv = new long[N];
        for (int i = 0; i < N; i++) {
            inv[i] = BigInteger.valueOf(i + 1).modInverse(BigInteger.valueOf(MOD)).longValue();
        }
        long[] cumsum = new long[N];
        cumsum[0] = inv[0];
        for (int i = 1; i < N; i++) {
            cumsum[i] = (cumsum[i - 1] + inv[i]) % MOD;
        }
        long[] temp = new long[N];
        for (int i = 0; i < N; i++) {
            temp[i] = (cumsum[i] + cumsum[N - 1 - i] - 1 + MOD) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans = (ans + A[i] * temp[i] % MOD) % MOD;
        }
        ans = ans * factFlat[N] % MOD;
        System.out.println(ans);
    }
}

