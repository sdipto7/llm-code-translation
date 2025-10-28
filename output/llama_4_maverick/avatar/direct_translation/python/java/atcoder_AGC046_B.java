
import java.util.Scanner;

public class atcoder_AGC046_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);
        int D = Integer.parseInt(input[3]);
        long m = 998244353L;
        long[][] d = new long[C + 1][D + 1];
        d[A][B] = 1;
        for (int i = A; i <= C; i++) {
            for (int j = B; j <= D; j++) {
                if (i == A && j == B) continue;
                d[i][j] = (d[i][j - 1] * i + d[i - 1][j] * j - d[i - 1][j - 1] * (i - 1) * (j - 1)) % m;
                if (d[i][j] < 0) d[i][j] += m;
            }
        }
        System.out.println(d[C][D]);
    }
}

