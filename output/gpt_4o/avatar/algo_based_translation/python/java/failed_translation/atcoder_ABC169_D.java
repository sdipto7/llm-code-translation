
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class atcoder_ABC169_D {
    public static final long INF = 999999999999999999L;
    public static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());

        if (n == 1) {
            System.out.println(0);
            return;
        }

        List<Integer> fac_ = primeFactorize(n);
        Map<Integer, Integer> fac = new HashMap<>();
        for (int p : fac_) {
            fac.put(p, fac.getOrDefault(p, 0) + 1);
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : fac.entrySet()) {
            int e = entry.getValue();
            int x = e;
            for (int i = 1; ; i++) {
                if (x >= i) {
                    x -= i;
                    ans++;
                } else {
                    break;
                }
            }
        }

        System.out.println(ans);
    }

    public static List<Integer> primeFactorize(int n) {
        List<Integer> a = new ArrayList<>();
        while (n % 2 == 0) {
            a.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.add(n);
        }
        return a;
    }
}

