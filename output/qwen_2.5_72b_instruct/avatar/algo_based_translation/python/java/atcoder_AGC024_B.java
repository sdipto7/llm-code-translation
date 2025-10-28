
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC024_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> P = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            P.add(scanner.nextInt());
        }
        scanner.close();
        editorial(N, P);
    }

    public static void editorial(int N, List<Integer> P) {
        if (N == 1) {
            System.out.println(0);
            return;
        }
        int[] a = new int[N + 1];
        for (int i = 0; i < N; i++) {
            int p = P.get(i);
            a[p] = i;
        }
        int tmp = 1;
        int max_len = 1;
        for (int i = 1; i < N; i++) {
            if (a[i] < a[i + 1]) {
                tmp++;
                max_len = Math.max(max_len, tmp);
            } else {
                tmp = 1;
            }
        }
        int ans = N - max_len;
        System.out.println(ans);
    }

    public static void WA(int N, List<Integer> P) {
        int tmp = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int p = P.get(i);
            if (i == 0 || P.get(i - 1) + 1 == p) {
                tmp++;
            } else {
                ans = Math.max(ans, tmp);
                tmp = 1;
            }
        }
        System.out.println(N - ans);
    }
}

