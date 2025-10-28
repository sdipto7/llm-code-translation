
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC107_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lst.add(scanner.nextInt());
        }

        List<Integer> lst_p = new ArrayList<>();
        List<Integer> lst_m = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int value = lst.get(i);
            if (value == 0) {
                K -= 1;
            } else if (value > 0) {
                lst_p.add(value);
            } else {
                lst_m.add(value);
            }
        }

        int lastx = lst_p.size();
        int lasty = lst_m.size();

        System.out.println(check(K, lst_p, lst_m, lastx, lasty));
    }

    private static int check(int k, List<Integer> lst_p, List<Integer> lst_m, int lastx, int lasty) {
        int ans = (int) Math.pow(10, 9);

        for (int j = 0; j <= k; j++) {
            if (j > lastx || k - j > lasty) {
                continue;
            } else {
                int p = (j == 0) ? 0 : lst_p.get(j - 1);
                int m = (k - j == 0) ? 0 : lst_m.get(lasty - (k - j));

                ans = Math.min(ans, 2 * p + Math.abs(m));
                ans = Math.min(ans, p + 2 * Math.abs(m));
            }
        }

        return ans;
    }
}

