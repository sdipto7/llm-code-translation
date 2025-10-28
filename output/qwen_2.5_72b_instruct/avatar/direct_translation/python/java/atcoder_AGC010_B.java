import java.util.Scanner;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int sumA = 0;
        for (int value : a) {
            sumA += value;
        }
        if (sumA % (n * (n + 1) / 2) != 0) {
            System.out.println("NO");
        } else {
            double k = (double) sumA / (n * (n + 1) / 2);
            int[] aExtended = new int[n + 1];
            System.arraycopy(a, 0, aExtended, 0, n);
            aExtended[n] = a[0];
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 1; i <= n; i++) {
                sum1 += (int) ((k - aExtended[i] + aExtended[i - 1]) % n);
                if ((k - aExtended[i] + aExtended[i - 1]) / n >= 0) {
                    sum2++;
                }
            }
            if (sum1 != 0 || sum2 != n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
