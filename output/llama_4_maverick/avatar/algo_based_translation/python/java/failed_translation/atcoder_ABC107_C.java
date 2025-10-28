
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
        int[] lst_p = new int[N];
        int[] lst_m = new int[N];
        int count_p = 0, count_m = 0;
        for (int i = 0; i < N; i++) {
            if (lst[i] == 0) {
                K -= 1;
            } else if (lst[i] > 0) {
                lst_p[count_p++] = lst[i];
            } else {
                lst_m[count_m++] = lst[i];
            }
        }
        int[] temp_p = new int[count_p];
        int[] temp_m = new int[count_m];
        System.arraycopy(lst_p, 0, temp_p, 0, count_p);
        System.arraycopy(lst_m, 0, temp_m, 0, count_m);
        Arrays.sort(temp_p);
        Arrays.sort(temp_m);
        int lastx = temp_p.length;
        int lasty = temp_m.length;
        System.out.println(check(K, temp_p, temp_m, lastx, lasty));
    }

    public static long check(int k, int[] lst_p, int[] lst_m, int lastx, int lasty) {
        long ans = (long) 1e9;
        for (int j = 0; j <= k; j++) {
            if (j > lastx || k - j > lasty) {
                continue;
            }
            long p = j == 0 ? 0 : lst_p[lastx - j];
            long m = k - j == 0 ? 0 : Math.abs(lst_m[lasty - (k - j)]);
            ans = Math.min(ans, Math.min(2 * p + m, p + 2 * m));
        }
        return ans;
    }
}

