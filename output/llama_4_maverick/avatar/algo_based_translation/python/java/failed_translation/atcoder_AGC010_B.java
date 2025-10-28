
import java.util.Scanner;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        long divisor = (long) n * (n + 1) / 2;
        if (sum % divisor != 0) {
            System.out.println("NO");
        } else {
            long k = sum / divisor;
            a[n] = a[0];
            long sumMod = 0;
            int countNonNegative = 0;
            for (int i = 0; i < n; i++) {
                long diff = k - a[i] + a[i - 1];
                sumMod += diff % n;
                if (diff / n >= 0) {
                    countNonNegative++;
                }
            }
            if (sumMod != 0 || countNonNegative != n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}

