
import java.util.Scanner;
import java.math.BigInteger;

public class atcoder_AGC028_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MOD = 1000000007;
        int N = scanner.nextInt();
        int M = 1000000;
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }
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
                fact[i][n] = (fact[i][n] * fact[i][n - 1]) % MOD;
            }
        }
        for (int n = 1; n < Nsq; n++) {
            for (int j = 0; j < Nsq; j++) {
                fact[n][j] = (fact[n][j] * fact[n - 1][Nsq - 1]) % MOD;
            }
        }
        long[] flatFact = new long[Nsq * Nsq];
        int index = 0;
        for (int i = 0; i < Nsq; i++) {
            for (int j = 0; j < Nsq; j++) {
                flatFact[index++] = fact[i][j];
            }
        }
        int[] jArray = new int[N];
        for (int i = 0; i < N; i++) {
            jArray[i] = i;
        }
        long[] inv = new long[N];
        for (int i = 0; i < N; i++) {
            inv[i] = BigInteger.valueOf(i + 1).modInverse(BigInteger.valueOf(MOD)).longValue();
        }
        for (int i = 1; i < N; i++) {
            inv[i] = (inv[i] + inv[i - 1]) % MOD;
        }
        long[] temp = new long[N];
        for (int i = 0; i < N; i++) {
            temp[i] = (inv[jArray[i]] + inv[N - 1 - jArray[i]] - 1 + MOD) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans = (ans + A[i] * temp[i]) % MOD;
        }
        ans = (ans * flatFact[N]) % MOD;
        System.out.println(ans);
    }
}

