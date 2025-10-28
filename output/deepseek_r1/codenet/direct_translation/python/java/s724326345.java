
import java.util.Scanner;

public class s724326345 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        long ans = 10000000000L;
        int max = Math.max(X, Y);
        for (int k = 0; k <= max; k++) {
            long total = 2L * C * k;
            total += A * Math.max(0, X - k);
            total += B * Math.max(0, Y - k);
            if (total < ans) {
                ans = total;
            }
        }
        System.out.println(ans);
    }
}

