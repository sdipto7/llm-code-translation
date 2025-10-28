
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s793709854 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of items and the total time allowed
        int N = scanner.nextInt();
        int T = scanner.nextInt();
        
        // Read the list of items, each with time and value
        List<int[]> L = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int time = scanner.nextInt();
            int value = scanner.nextInt();
            L.add(new int[]{time, value});
        }
        
        // Initialize the dp array
        int[][] dp = new int[N + 1][T];
        
        // Populate the dp array
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < T; j++) {
                if (j < L.get(i)[0]) {
                    dp[i + 1][j] = dp[i][j];
                } else {
                    dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - L.get(i)[0]] + L.get(i)[1]);
                }
            }
        }
        
        // Find the items used in one optimal solution
        List<Integer> used = new ArrayList<>();
        int B = dp[N][T - 1];
        int j = T - 1;
        for (int i = N - 1; i >= 0; i--) {
            if (B == dp[i][j]) {
                continue;
            }
            B -= L.get(i)[1];
            used.add(i);
            j -= L.get(i)[0];
        }

        // Calculate the answer
        int ans = dp[N][T - 1];
        int c = 0;
        for (int i = 0; i < N; i++) {
            if (!used.contains(i)) {
                c = Math.max(c, L.get(i)[1]);
            }
        }
        
        // Print the result
        System.out.println(ans + c);
    }
}

