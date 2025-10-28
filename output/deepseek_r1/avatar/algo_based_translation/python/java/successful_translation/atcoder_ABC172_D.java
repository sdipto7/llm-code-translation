
import java.util.Scanner;

public class atcoder_ABC172_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long ans = 0;
        for (long i = 1; i <= N; i++) {
            long k = N / i;
            ans += i * k * (k + 1) / 2;
        }
        System.out.println(ans);
    }
}

