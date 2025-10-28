
import java.util.Scanner;

public class atcoder_AGC028_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = 1000000;
        long MOD = 1000000007;
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }
        int Nsq = 1000;
        long[][] fact = new long[Nsq][Nsq];
        fact[0][0] = 1;
        for (int n = 1; n < Nsq; n++) {
            for (int i = 0; i < Nsq; i++) {
                fact[i][n] = (fact[i][n] * fact[i][n - 1]) % MOD;
            }
        }
        for (int n = 1; n < Nsq; n++) {
            for (int i = 0; i < Nsq; i++) {
                fact[n][i] = (fact[n][i] * fact[n - 1][Nsq - 1]) % MOD;
            }
        }
        long[] flatFact = new long[Nsq * Nsq];
        for (int i = 0; i < Nsq; i++) {
            for (int j = 0; j < Nsq; j++) {
                flatFact[i * Nsq + j] = fact[i][j];
            }
        }
        int[] j = new int[N];
        for (int i = 0; i < N; i++) {
            j[i] = i;
        }
        long[] inv = new long[N];
        for (int i = 0; i < N; i++) {
            inv[i] = pow(i + 1, MOD - 2, MOD);
        }
        for (int i = 1; i < N; i++) {
            inv[i] = (inv[i] + inv[i - 1]) % MOD;
        }
        long[] temp = new long[N];
        for (int i = 0; i < N; i++) {
            temp[i] = (inv[j[i]] + inv[N - 1 - j[i]] - 1 + MOD) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans = (ans + A[i] * temp[i] % MOD) % MOD;
        }
        ans = (ans * flatFact[N]) % MOD;
        System.out.println(ans);
    }

    public static long pow(long base, long exp, long mod) {
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            exp = exp >> 1;
            base = (base * base) % mod;
        }
        return result;
    }
}

