
import java.util.Scanner;

public class s662673721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long ans = Long.MAX_VALUE;
        long sqrt_n = (long) Math.sqrt(n) + 2;
        
        for (long i = 1; i < sqrt_n; i++) {
            if (n % i != 0) {
                continue;
            }
            long j = n / i;
            long current_sum = i + j - 2;
            if (current_sum < ans) {
                ans = current_sum;
            }
        }
        
        System.out.println(ans);
    }
}

