import java.util.*;

public class s534639230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            D[i] = sc.nextInt();
        }

        int mod = 998244353;

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

        long res = 1;

        int maxD = Arrays.stream(D).max().getAsInt();
        for (int i = 1; i <= maxD; i++) {
            if (cnt.get(i - 1) == null) {
                System.out.println(0);
                return;
            }
            if (cnt.get(i - 1) == 1) {
                continue;
            }
            res = res * pow(cnt.get(i - 1), cnt.getOrDefault(i, 0), mod) % mod;
        }

        System.out.println(res);
    }

    private static long pow(int base, int exp, int mod) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result = result * base % mod;
        }
        return result;
    }
}
