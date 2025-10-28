
import java.util.Scanner;

public class s662673721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = (long) 1e18;
        for (long i = 1; i * i <= n + 1; i++) {
            if (n % i == 0) {
                long j = n / i;
                ans = Math.min(ans, i + j - 2);
            }
        }
        System.out.println(ans);
    }
}

