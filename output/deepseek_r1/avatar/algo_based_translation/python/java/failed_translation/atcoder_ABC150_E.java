
import java.util.*;
import java.math.BigInteger;

public class atcoder_ABC150_E {
    private static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputValues = scanner.nextLine().split(" ");
        
        List<Integer> c = new ArrayList<>();
        for (String val : inputValues) {
            c.add(Integer.parseInt(val));
        }
        Collections.sort(c, Collections.reverseOrder());

        BigInteger exponent = BigInteger.valueOf(2L * n - 2);
        BigInteger base = BigInteger.valueOf(2);
        BigInteger mod = BigInteger.valueOf(MOD);
        long b = base.modPow(exponent, mod).longValue();
        long a = (2 * b) % MOD;
        
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long term = (long) c.get(i) * (a + (long) i * b);
            ans = (ans + term) % MOD;
        }
        
        System.out.println(ans);
    }
}

