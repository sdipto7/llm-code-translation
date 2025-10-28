
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class s534639230 {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            D[i] = scanner.nextInt();
        }
        scanner.close();

        int mod = 998244353;

        if (D[0] != 0) {
            System.out.println(0);
            return;
        }

        Map<Integer, Integer> cnt = new HashMap<>();
        for (int num : D) {
            cnt.put(num, cnt.getOrDefault(num, 0) + 1);
        }

        if (cnt.getOrDefault(0, 0) > 1) {
            System.out.println(0);
            return;
        }

        long res = 1;

        int max = 0;
        for (int num : D) {
            max = Math.max(max, num);
        }

        for (int i = 1; i <= max; i++) {
            if (cnt.getOrDefault(i - 1, 0) <= 1) {
                continue;
            }
            res = (res * powMod(cnt.get(i - 1), cnt.get(i), mod)) % mod;
        }

        System.out.println(res);
    }

    public static long powMod(int base, int exponent, int mod) {
        long result = 1;
        long b = base;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * b) % mod;
            }
            b = (b * b) % mod;
            exponent >>= 1;
        }
        return result;
    }
}

