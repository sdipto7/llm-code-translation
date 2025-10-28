
import java.util.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        Map<Integer, Integer> factors = primeFactorize(n);
        int ans = 0;
        for (int e : factors.values()) {
            int x = e;
            int i = 1;
            while (x >= i) {
                x -= i;
                ans++;
                i++;
            }
        }
        System.out.println(ans);
    }

    private static Map<Integer, Integer> primeFactorize(int n) {
        Map<Integer, Integer> factors = new HashMap<>();
        while (n % 2 == 0) {
            factors.put(2, factors.getOrDefault(2, 0) + 1);
            n /= 2;
        }
        for (int f = 3; f * f <= n; f += 2) {
            while (n % f == 0) {
                factors.put(f, factors.getOrDefault(f, 0) + 1);
                n /= f;
            }
        }
        if (n > 1) {
            factors.put(n, factors.getOrDefault(n, 0) + 1);
        }
        return factors;
    }
}

