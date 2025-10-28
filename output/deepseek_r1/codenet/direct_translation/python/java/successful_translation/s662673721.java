
import java.util.Scanner;

public class s662673721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long ans = Long.MAX_VALUE;

        for (long i = 1; i <= (long) Math.sqrt(n) + 1; i++) {
            if (n % i != 0) {
                continue;
            }
            long j = n / i;
            ans = Math.min(ans, i + j - 2);
        }

        System.out.println(ans);
    }
}

