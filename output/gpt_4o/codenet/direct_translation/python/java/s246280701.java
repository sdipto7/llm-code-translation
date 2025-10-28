
import java.util.Scanner;

public class s246280701 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int j = 0; j < n; j++) {
            x[j] = scanner.nextInt();
        }
        long ans = (long)Math.pow(10, 10);
        for (int i = 0; i <= 100; i++) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Math.pow(Math.abs(i - x[j]), 2);
            }
            if (sum < ans) {
                ans = sum;
            }
        }
        System.out.println(ans);
    }
}

