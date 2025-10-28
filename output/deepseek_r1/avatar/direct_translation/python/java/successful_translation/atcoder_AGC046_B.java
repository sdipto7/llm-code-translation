
import java.util.Scanner;

public class atcoder_AGC046_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int m = 998244353;
        long[][] d = new long[C + 1][D + 1];
        d[A][B] = 1;
        for (int i = A; i <= C; i++) {
            for (int j = B; j <= D; j++) {
                if (i == A && j == B) continue;
                long current = 0;
                if (j > B) current = (current + d[i][j - 1] * i) % m;
                if (i > A) current = (current + d[i - 1][j] * j) % m;
                if (i > A && j > B) {
                    long product = ((long) (i - 1) * (j - 1)) % m;
                    long subtract = (d[i - 1][j - 1] * product) % m;
                    current = (current - subtract + m) % m;
                }
                d[i][j] = current;
            }
        }
        System.out.println(d[C][D] % m);
    }
}

