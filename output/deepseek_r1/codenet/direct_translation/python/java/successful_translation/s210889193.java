
import java.util.Scanner;

public class s210889193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] action = new int[N][3];
        for (int i = 0; i < N; i++) {
            action[i][0] = sc.nextInt();
            action[i][1] = sc.nextInt();
            action[i][2] = sc.nextInt();
        }
        int[][] dp = new int[N][3];
        dp[0][0] = action[0][0];
        dp[0][1] = action[0][1];
        dp[0][2] = action[0][2];
        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.max(dp[i - 1][1] + action[i][0], dp[i - 1][2] + action[i][0]);
            dp[i][1] = Math.max(dp[i - 1][0] + action[i][1], dp[i - 1][2] + action[i][1]);
            dp[i][2] = Math.max(dp[i - 1][0] + action[i][2], dp[i - 1][1] + action[i][2]);
        }
        System.out.println(Math.max(dp[N - 1][0], Math.max(dp[N - 1][1], dp[N - 1][2])));
    }
}

