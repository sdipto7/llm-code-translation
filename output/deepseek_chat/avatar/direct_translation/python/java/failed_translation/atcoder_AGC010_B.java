import java.util.*;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (Arrays.stream(a).sum() % (n * (n + 1) / 2) != 0) {
            System.out.println("NO");
        } else {
            int k = Arrays.stream(a).sum() / (n * (n + 1) / 2);
            int[] extendedA = Arrays.copyOf(a, n + 1);
            extendedA[n] = a[0];
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < n; i++) {
                sum1 += (k - extendedA[i + 1] + extendedA[i]) % n;
                sum2 += (k - extendedA[i + 1] + extendedA[i]) / n >= 0 ? 1 : 0;
            }
            if (sum1 != 0 || sum2 != n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
