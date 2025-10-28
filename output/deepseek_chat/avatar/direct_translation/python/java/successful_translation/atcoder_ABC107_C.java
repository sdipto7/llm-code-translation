import java.util.*;

public class atcoder_ABC107_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = scanner.nextInt();
        }
        List<Integer> lst_p = new ArrayList<>();
        List<Integer> lst_m = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (lst[i] == 0) {
                K--;
            }
            if (lst[i] > 0) {
                lst_p.add(lst[i]);
            } else if (lst[i] < 0) {
                lst_m.add(lst[i]);
            }
        }
        int lastx = lst_p.size();
        int lasty = lst_m.size();
        System.out.println(check(K, lst_p, lst_m, lastx, lasty));
    }

    private static int check(int K, List<Integer> lst_p, List<Integer> lst_m, int lastx, int lasty) {
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j <= K; j++) {
            if (j > lastx || K - j > lasty) {
                continue;
            }
            int p = 0;
            if (j != 0) {
                p = lst_p.get(j - 1);
            }
            int m = 0;
            if (K - j != 0) {
                m = lst_m.get(lasty - (K - j));
            }
            ans = Math.min(ans, Math.min(2 * p + Math.abs(m), p + 2 * Math.abs(m)));
        }
        return ans;
    }
}
