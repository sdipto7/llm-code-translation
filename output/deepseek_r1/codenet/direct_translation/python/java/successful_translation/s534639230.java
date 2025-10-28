
import java.util.*;

public class s534639230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            D[i] = sc.nextInt();
        }
        if (D[0] != 0) {
            System.out.println(0);
            return;
        }
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int d : D) {
            cnt.put(d, cnt.getOrDefault(d, 0) + 1);
        }
        if (cnt.get(0) > 1) {
            System.out.println(0);
            return;
        }
        int maxD = 0;
        for (int d : D) {
            if (d > maxD) {
                maxD = d;
            }
        }
        long mod = 998244353;
        long res = 1;
        for (int i = 1; i <= maxD; i++) {
            int prevCount = cnt.getOrDefault(i - 1, 0);
            if (prevCount == 1) {
                continue;
            }
            int currentCount = cnt.getOrDefault(i, 0);
            res = (res * powMod(prevCount, currentCount, mod)) % mod;
        }
        System.out.println(res);
    }

    private static long powMod(long a, long b, long mod) {
        if (b == 0) return 1 % mod;
        a %= mod;
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
}

