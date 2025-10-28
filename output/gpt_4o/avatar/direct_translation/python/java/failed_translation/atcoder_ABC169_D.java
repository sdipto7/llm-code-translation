
import java.util.*;
import java.io.*;

public class atcoder_ABC169_D {
    static int INF = 999999999;
    static int MOD = 1000000007;

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
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

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

