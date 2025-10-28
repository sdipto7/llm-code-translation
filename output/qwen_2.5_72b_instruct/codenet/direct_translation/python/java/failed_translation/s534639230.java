import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            D[i] = scanner.nextInt();
        }

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

        for (int i = 1; i <= Collections.max(Arrays.asList(Arrays.stream(D).boxed().toArray(Integer[]::new))); i++) {
            if (cnt.getOrDefault(i - 1, 0) == 1) {
                continue;
            }
            res *= Math.pow(cnt.getOrDefault(i - 1, 0), cnt.getOrDefault(i, 0)) % mod;
            res %= mod;
        }

        System.out.println(res);
    }
}
