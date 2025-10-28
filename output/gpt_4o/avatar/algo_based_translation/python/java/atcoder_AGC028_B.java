
import java.util.*;
import java.io.*;

public class atcoder_AGC028_B {
    static final int MOD = 1000000007;
    static final int M = 1000000;
    static final int Nsq = 1000;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine().trim());
        String[] inputLine = reader.readLine().trim().split(" ");
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(inputLine[i]);
        }

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

        List<Long> factList = new ArrayList<>();
        for (int i = 0; i < Nsq; i++) {
            for (int j = 0; j < Nsq; j++) {
                factList.add(fact[i][j]);
            }
        }

        long[] j = new long[N];
        for (int i = 0; i < N; i++) {
            j[i] = i;
        }

        long[] inv = new long[N];
        for (int i = 0; i < N; i++) {
            inv[i] = powMod(i + 1, MOD - 2, MOD);
        }

        long[] invCumsum = new long[N];
        invCumsum[0] = inv[0];
        for (int i = 1; i < N; i++) {
            invCumsum[i] = (invCumsum[i - 1] + inv[i]) % MOD;
        }

        long[] temp = new long[N];
        for (int i = 0; i < N; i++) {
            temp[i] = (invCumsum[(int) j[i]] + invCumsum[N - 1 - (int) j[i]] - 1 + MOD) % MOD;
        }

        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans = (ans + A[i] * temp[i] % MOD) % MOD;
        }

        ans = (ans * factList.get(N)) % MOD;

        System.out.println(ans);
    }

    public static long powMod(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}

