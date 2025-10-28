
import java.util.Scanner;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mod = 1000000007;
        String S = scanner.nextLine().trim();
        int n = S.length();
        
        if (n == 1) {
            if (S.equals("5") || S.equals("?")) {
                System.out.println(1);
                return;
            } else {
                System.out.println(0);
                return;
            }
        }
        
        int[][] dp = new int[n][13];
        
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (!S.charAt(i).equals('?')) {
                    dp[i][Character.getNumericValue(S.charAt(i))]++;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[i][j]++;
                    }
                }
            } else {
                if (!S.charAt(i).equals('?')) {
                    for (int k = 0; k < 13; k++) {
                        dp[i][(k * 10 + Character.getNumericValue(S.charAt(i))) % 13] = (dp[i][(k * 10 + Character.getNumericValue(S.charAt(i))) % 13] + dp[i - 1][k]) % mod;
                    }
                } else {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 13; k++) {
                            dp[i][(k * 10 + j) % 13] = (dp[i][(k * 10 + j) % 13] + dp[i - 1][k]) % mod;
                        }
                    }
                }
            }
        }
        
        System.out.println(dp[n - 1][5]);
    }
}

