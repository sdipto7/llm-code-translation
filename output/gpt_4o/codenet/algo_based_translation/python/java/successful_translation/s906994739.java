
import java.util.Scanner;

public class s906994739 {
    public static void main(String[] args) {
        calculateMaxProfit();
    }

    public static int calculateMaxProfit() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] F = new int[n][10];
        int[][] P = new int[n][11];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                F[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 10; j++) {
                P[i][j] = scanner.nextInt();
            }
        }

        long ans = -1000000000000000000L;

        for (int i = 1; i < (1 << 10); i++) {
            int tmp = 0;
            int[] lst = new int[n];

            for (int j = 0; j < 10; j++) {
                if ((i >> j & 1) == 1) {
                    for (int k = 0; k < n; k++) {
                        lst[k] += F[k][j];
                    }
                }
            }

            for (int k = 0; k < n; k++) {
                tmp += P[k][lst[k]];
            }

            ans = Math.max(ans, tmp);
        }

        System.out.println(ans);
        scanner.close();
        
        return (int) ans;
    }
}

