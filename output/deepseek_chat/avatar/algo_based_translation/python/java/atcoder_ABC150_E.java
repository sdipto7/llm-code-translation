
import java.util.*;
import java.math.*;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mod = 1000000007;
        int n = scanner.nextInt();
        Integer[] c = new Integer[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        Arrays.sort(c, Collections.reverseOrder());
        BigInteger base = BigInteger.valueOf(2);
        BigInteger exponent = BigInteger.valueOf(2L * n - 2);
        BigInteger modBig = BigInteger.valueOf(mod);
        BigInteger bBig = base.modPow(exponent, modBig);
        int b = bBig.intValue();
        int a = (int)((2L * b) % mod);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long term = (long)c[i] * (a + (long)i * b);
            ans = (ans + term) % mod;
        }
        System.out.println(ans);
    }
}

