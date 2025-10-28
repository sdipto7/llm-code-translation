import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        for (int i = 0; i < N; i++) {
            if (lst.get(i) == 0) {
                K -= 1;
            }
            if (lst.get(i) > 0) {
                lst_p.add(lst.get(i));
            } else if (lst.get(i) < 0) {
                lst_m.add(lst.get(i));
            }
        }
        int p = 0;
        int m = 0;
        int x = 0;
        int y = lst_m.size() - 1;
        int lastx = lst_p.size();
        int lasty = lst_m.size();
        System.out.println(check(K, lst_p, lst_m, lastx, lasty));
    }

    public static int check(int k, List<Integer> lst_p, List<Integer> lst_m, int lastx, int lasty) {
        int ans = 1000000000;
        for (int j = 0; j <= k; j++) {
            if (j > lastx || k - j > lasty) {
                continue;
            } else {
                if (j == 0) {
                    p = 0;
                } else {
                    p = lst_p.get(j - 1);
                }
                if (k - j == 0) {
                    m = 0;
                } else {
                    m = lst_m.get(lasty - (k - j));
                }
                ans = Math.min(ans, Math.min(2 * p + Math.abs(m), p + 2 * Math.abs(m)));
            }
        }
        return ans;
    }
}
