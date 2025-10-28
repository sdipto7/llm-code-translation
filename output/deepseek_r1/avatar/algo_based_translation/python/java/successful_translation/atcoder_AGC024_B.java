
import java.util.Scanner;

public class atcoder_AGC024_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }
        editorial(n, p);
    }

    public static void editorial(int n, int[] p) {
        if (n == 1) {
            System.out.println(0);
            return;
        }
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[p[i]] = i;
        }
        int tmp = 1;
        int maxLen = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i + 1]) {
                tmp++;
                maxLen = Math.max(maxLen, tmp);
            } else {
                tmp = 1;
            }
        }
        System.out.println(n - maxLen);
    }

    public static void wa(int n, int[] p) {
        int tmp = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || p[i - 1] + 1 == p[i]) {
                tmp++;
            } else {
                ans = Math.max(ans, tmp);
                tmp = 1;
            }
        }
        ans = Math.max(ans, tmp);
        System.out.println(n - ans);
    }
}

