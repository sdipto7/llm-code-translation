
import java.util.*;
import java.io.*;

public class atcoder_ABC169_D {
    static final int MOD = (int) (1e9 + 7);
    static final long INF = 999999999999999999L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.println(0);
            return;
        }

        List<Integer> fac_ = primeFactorize(n);
        Map<Integer, Integer> fac = new HashMap<>();
        for (int f : fac_) {
            fac.put(f, fac.getOrDefault(f, 0) + 1);
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : fac.entrySet()) {
            int e = entry.getValue();
            int i = 1;
            while (e >= i) {
                e -= i;
                ans++;
                i++;
            }
        }
        System.out.println(ans);
    }

    static List<Integer> primeFactorize(int n) {
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

