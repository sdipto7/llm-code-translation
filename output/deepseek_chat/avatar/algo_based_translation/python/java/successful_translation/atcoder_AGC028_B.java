
import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class atcoder_AGC028_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long MOD = 1000000007L;
        int M = 1000000;
        int Nsq = 1000;
        
        String[] tokens = br.readLine().split(" ");
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(tokens[i]);
        }
        
        long[][] fact2D = new long[Nsq][Nsq];
        for (int i = 0; i < Nsq; i++) {
            for (int j = 0; j < Nsq; j++) {
                fact2D[i][j] = i * Nsq + j;
            }
        }
        fact2D[0][0] = 1;
        
        for (int n = 1; n < Nsq; n++) {
            for (int i = 0; i < Nsq; i++) {
                fact2D[i][n] = fact2D[i][n] * fact2D[i][n-1] % MOD;
            }
        }
        
        for (int n = 1; n < Nsq; n++) {
            long prev = fact2D[n-1][Nsq-1];
            for (int j = 0; j < Nsq; j++) {
                fact2D[n][j] = fact2D[n][j] * prev % MOD;
            }
        }
        
        long[] fact = new long[M];
        for (int i = 0; i < Nsq; i++) {
            for (int j = 0; j < Nsq; j++) {
                fact[i * Nsq + j] = fact2D[i][j];
            }
        }
        
        int[] j = new int[N];
        for (int i = 0; i < N; i++) {
            j[i] = i;
        }
        
        long[] inv = new long[N];
        for (int i = 0; i < N; i++) {
            BigInteger base = BigInteger.valueOf(i + 1);
            BigInteger mod = BigInteger.valueOf(MOD);
            BigInteger result = base.modPow(mod.subtract(BigInteger.valueOf(2)), mod);
            inv[i] = result.longValue();
        }
        
        long[] cumInv = new long[N];
        cumInv[0] = inv[0];
        for (int i = 1; i < N; i++) {
            cumInv[i] = (cumInv[i-1] + inv[i]) % MOD;
        }
        
        long[] temp = new long[N];
        for (int i = 0; i < N; i++) {
            temp[i] = (cumInv[i] + cumInv[N - 1 - i] - 1 + MOD) % MOD;
        }
        
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum = (sum + A[i] * temp[i] % MOD) % MOD;
        }
        
        long ans = sum * fact[N] % MOD;
        System.out.println(ans);
    }
}

