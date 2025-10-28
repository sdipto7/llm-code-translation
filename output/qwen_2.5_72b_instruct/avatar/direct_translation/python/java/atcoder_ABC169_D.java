
import java.util.*;
import java.io.*;

public class atcoder_ABC169_D {
    static final long INF = 999999999999999999999999L;
    static final long MOD = 1000000007L;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
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
            int x = entry.getValue();
            for (int i = 1; i < 99999999; i++) {
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

    static List<Integer> primeFactorize(int n) {
        List<Integer> a = new ArrayList<>();
        while (n % 2 == 0) {
            a.add(2);
            n /= 2;
        }
        for (int f = 3; f * f <= n; f += 2) {
            if (n % f == 0) {
                a.add(f);
                n /= f;
            }
        }
        if (n != 1) {
            a.add(n);
        }
        return a;
    }
}

