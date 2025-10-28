
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
                long term1 = (i > 0 && j - 1 >= B) ? d[i][j - 1] * i : 0;
                long term2 = (i - 1 >= A && j > 0) ? d[i - 1][j] * j : 0;
                long term3 = (i - 1 >= A && j - 1 >= B) ? d[i - 1][j - 1] * (i - 1) * (j - 1) : 0;
                d[i][j] = (d[i][j] + term1 + term2 - term3) % m;
                if (d[i][j] < 0) d[i][j] += m;
            }
        }
        System.out.println(d[C][D]);
    }
}

