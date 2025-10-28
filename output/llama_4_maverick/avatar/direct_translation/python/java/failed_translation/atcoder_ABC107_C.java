
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC107_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = scanner.nextInt();
        }
        int[] lst_p = Arrays.stream(lst).filter(x -> x > 0).toArray();
        int[] lst_m = Arrays.stream(lst).filter(x -> x < 0).map(x -> -x).toArray();
        Arrays.sort(lst_p);
        Arrays.sort(lst_m);
        for (int i = 0; i < N; i++) {
            if (lst[i] == 0) {
                K -= 1;
            }
        }
        int lastx = lst_p.length;
        int lasty = lst_m.length;
        System.out.println(check(K, lst_p, lst_m, lastx, lasty));
    }

    public static long check(int k, int[] lst_p, int[] lst_m, int lastx, int lasty) {
        long ans = (long) 1e9;
        for (int j = 0; j <= k; j++) {
            if (j <= lastx && k - j <= lasty) {
                long p = j == 0 ? 0 : lst_p[lastx - j];
                long m = k - j == 0 ? 0 : lst_m[lasty - (k - j)];
                ans = Math.min(ans, Math.min(2 * p + m, p + 2 * m));
            }
        }
        return ans;
    }
}

