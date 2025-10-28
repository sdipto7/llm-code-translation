
import java.util.Scanner;
import java.math.BigInteger;

public class atcoder_AGC028_B {
    static final int MOD = (int)1e9 + 7;
    static final int M = (int)1e6;
    static final int Nsq = (int)1e3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        long[][] fact = new long[Nsq][Nsq];
        fact[0][0] = 1;
        for (int n = 1; n < Nsq; n++) {
            fact[0][n] = fact[0][n - 1] * n % MOD;
            for (int i = 1; i < Nsq; i++) {
                fact[i][n] = fact[i][n - 1] * (i * Nsq + n) % MOD;
            }
        }
        for (int n = 1; n < Nsq; n++) {
            fact[n][0] = fact[n - 1][Nsq - 1] * (n * Nsq) % MOD;
            for (int i = 1; i < Nsq; i++) {
                fact[n][i] = fact[n][i - 1] * (n * Nsq + i) % MOD;
            }
        }
        long[] factFlat = new long[M];
        int index = 0;
        for (int i = 0; i < Nsq; i++) {
            for (int j = 0; j < Nsq; j++) {
                factFlat[index++] = fact[i][j];
            }
        }
        long[] inv = new long[N];
        inv[0] = BigInteger.valueOf(2).modInverse(BigInteger.valueOf(MOD)).longValue();
        for (int i = 1; i < N; i++) {
            inv[i] = (inv[i - 1] + BigInteger.valueOf(i + 2).modInverse(BigInteger.valueOf(MOD)).longValue()) % MOD;
        }
        long ans = 0;
        for (int j = 0; j < N; j++) {
            long temp = (inv[j] + inv[N - 1 - j] - 1 + MOD) % MOD;
            ans = (ans + A[j] * temp % MOD) % MOD;
        }
        ans = ans * factFlat[N] % MOD;
        System.out.println(ans);
    }
}

