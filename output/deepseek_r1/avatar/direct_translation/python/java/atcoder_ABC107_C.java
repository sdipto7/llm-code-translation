
import java.util.*;

public class atcoder_ABC107_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lst.add(scanner.nextInt());
        }
        List<Integer> lst_p = new ArrayList<>();
        List<Integer> lst_m = new ArrayList<>();
        for (int num : lst) {
            if (num == 0) {
                K--;
            } else if (num > 0) {
                lst_p.add(num);
            } else {
                lst_m.add(num);
            }
        }
        int lastx = lst_p.size();
        int lasty = lst_m.size();
        System.out.println(check(K, lst_p, lst_m, lastx, lasty));
    }

    private static int check(int k, List<Integer> lst_p, List<Integer> lst_m, int lastx, int lasty) {
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j <= k; j++) {
            if (j > lastx || (k - j) > lasty) continue;
            int p = j > 0 ? lst_p.get(j - 1) : 0;
            int m = (k - j) > 0 ? lst_m.get(lasty - (k - j)) : 0;
            ans = Math.min(ans, Math.min(2 * p + Math.abs(m), p + 2 * Math.abs(m)));
        }
        return ans;
    }
}

