
import java.util.Scanner;

public class s246280701 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        long ans = 10000000000L;
        for (int i = 0; i <= 100; i++) {
            long sum_tmp = 0;
            for (int j = 0; j < n; j++) {
                long diff = Math.abs(i - x[j]);
                sum_tmp += diff * diff;
            }
            if (sum_tmp < ans) {
                ans = sum_tmp;
            }
        }
        System.out.println(ans);
    }
}

