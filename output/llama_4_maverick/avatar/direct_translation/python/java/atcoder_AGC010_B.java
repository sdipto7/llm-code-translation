
import java.util.Scanner;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
            sum += a[i];
        }
        if (sum % (n * (n + 1) / 2) != 0) {
            System.out.println("NO");
        } else {
            long k = sum / (n * (n + 1) / 2);
            long[] b = new long[n];
            int count = 0;
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                long diff = (k - a[(i + 1) % n] + a[i]) % n;
                if (diff < 0 || (k - a[(i + 1) % n] + a[i]) / n < 0) {
                    flag = false;
                    break;
                }
                b[i] = diff;
                count += (k - a[(i + 1) % n] + a[i]) / n;
            }
            if (!flag || count != n || sum(b) != n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

    public static long sum(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum;
    }
}

