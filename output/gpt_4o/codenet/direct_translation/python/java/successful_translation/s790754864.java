
import java.util.Scanner;

public class s790754864 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int R = N - K;
        int mod = 1000000007;

        for (int i = 1; i <= K; i++) {
            long ans;
            if (N - K + 1 < i) {
                ans = 0;
            } else {
                ans = fact(R + 1, i) * fact(K - 1, i - 1);
            }
            System.out.println(ans % mod);
        }
    }

    static long fact(int n, int r) {
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

