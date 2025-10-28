
import java.util.*;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum += a[i];
        }
        if (sum % (n * (n + 1) / 2) != 0) {
            System.out.println("NO");
        } else {
            int k = sum / (n * (n + 1) / 2);
            boolean valid = true;
            for (int i = 0; i < n; i++) {
                int diff = k - a[i] + a[(i + 1) % n];
                if (diff % n != 0 || diff / n < 0) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}

