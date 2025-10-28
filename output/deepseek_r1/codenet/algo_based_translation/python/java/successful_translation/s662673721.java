
import java.util.Scanner;

public class s662673721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long ans = (long) 1e18;
        int upper = (int) Math.sqrt(n) + 2;
        for (int i = 1; i < upper; i++) {
            if (n % i == 0) {
                long j = n / i;
                ans = Math.min(ans, i + j - 2);
            }
        }
        System.out.println(ans);
    }
}

