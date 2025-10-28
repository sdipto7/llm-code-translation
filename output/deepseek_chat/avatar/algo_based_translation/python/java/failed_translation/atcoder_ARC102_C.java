
import java.util.*;
import java.math.*;

public class atcoder_ARC102_C {
    static final long mod = 998244353;
    static int K, N;
    static long[] g1, g2, inverse;
    static int __N = 8000;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();
        
        g1 = new long[__N + 1];
        g2 = new long[__N + 1];
        inverse = new long[__N + 1];
        
        g1[0] = 1;
        g1[1] = 1;
        g2[0] = 1;
        g2[1] = 1;
        inverse[0] = 0;
        inverse[1] = 1;
        
        for (int i = 2; i <= __N; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = ((-inverse[(int)(mod % i)] * (mod / i)) % mod + mod) % mod;
            g2[i] = (g2[i - 1] * inverse[i]) % mod;
        }
        
        List<Long> ansList = new ArrayList<>();
        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                long tmp = solve(i) % mod;
                ansList.add(tmp);
                System.out.println(tmp);
            } else {
                System.out.println(ansList.get(-i + K));
            }
        }
    }
    
    static long cmb(int n, int r, long mod) {
        if (r < 0 || r > n) return 0;
        r = Math.min(r, n - r);
        return (g1[n] * g2[r] % mod) * g2[n - r] % mod;
    }
    
    static long kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, mod);
    }
    
    static long solve(int n) {
        assert n <= K + 1;
        long ans = 0;
        int kumi = (n - 1) / 2;
        
        for (int p = 0; p <= kumi; p++) {
            if (p > N) break;
            
            int evenAdjust = (n % 2 == 0) ? 1 : 0;
            int qVal = p + (K - kumi * 2 - evenAdjust);
            
            long term1 = (BigInteger.valueOf(2).modPow(BigInteger.valueOf(p), BigInteger.valueOf(mod)).longValue() 
                        * cmb(kumi, p, mod) % mod) 
                        * kumiawase(N - p, qVal) % mod;
            ans = (ans + term1) % mod;
            
            if (n % 2 == 0 && N - p - 1 >= 0) {
                long term2 = (BigInteger.valueOf(2).modPow(BigInteger.valueOf(p), BigInteger.valueOf(mod)).longValue() 
                            * cmb(kumi, p, mod) % mod) 
                            * kumiawase(N - p - 1, qVal) % mod;
                ans = (ans + term2) % mod;
            }
        }
        return ans;
    }
}

