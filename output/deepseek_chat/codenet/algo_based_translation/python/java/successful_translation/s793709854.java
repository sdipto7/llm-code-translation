
import java.util.Scanner;
import java.util.ArrayList;

public class s793709854 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        scanner.nextLine();
        
        int[][] L = new int[N][2];
        for (int i = 0; i < N; i++) {
            L[i][0] = scanner.nextInt();
            L[i][1] = scanner.nextInt();
            if (i < N - 1) {
                scanner.nextLine();
            }
        }
        
        int[][] dp = new int[N + 1][T];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < T; j++) {
                dp[i][j] = 0;
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < T; j++) {
                if (j < L[i][0]) {
                    dp[i + 1][j] = dp[i][j];
                } else {
                    dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - L[i][0]] + L[i][1]);
                }
            }
        }
        
        ArrayList<Integer> used = new ArrayList<>();
        int B = dp[N][T - 1];
        int j = T - 1;
        for (int i = N - 1; i >= 0; i--) {
            if (B == dp[i][j]) {
                continue;
            }
            B -= L[i][1];
            used.add(i);
            j -= L[i][0];
        }
        
        int ans = dp[N][T - 1];
        int c = 0;
        for (int i = 0; i < N; i++) {
            if (!used.contains(i)) {
                c = Math.max(c, L[i][1]);
            }
        }
        
        System.out.println(ans + c);
    }
}

