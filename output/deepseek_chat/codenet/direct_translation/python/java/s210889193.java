To translate the provided Python code into Java, we need to follow Java's syntax and structure. Below is the corresponding Java code:


import java.util.Scanner;

public class s210889193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] action = new int[N][3];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                action[i][j] = scanner.nextInt();
            }
        }
        int[][] dp = new int[N][3];
        for (int i = 0; i < 3; i++) {
            dp[0][i] = action[0][i];
        }
        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.max(dp[i - 1][1] + action[i][0], dp[i - 1][2] + action[i][0]);
            dp[i][1] = Math.max(dp[i - 1][0] + action[i][1], dp[i - 1][2] + action[i][1]);
            dp[i][2] = Math.max(dp[i - 1][0] + action[i][2], dp[i - 1][1] + action[i][2]);
        }
        System.out.println(Math.max(dp[N - 1][0], Math.max(dp[N - 1][1], dp[N - 1][2])));
    }
}


This Java code performs the same operations as the Python code, including reading input, initializing arrays, and using dynamic programming to compute the results. The final output is printed using Java's `System.out.println` method.
