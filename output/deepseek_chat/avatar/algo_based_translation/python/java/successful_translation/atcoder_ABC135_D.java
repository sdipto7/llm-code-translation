
import java.util.*;
import java.io.*;

public class atcoder_ABC135_D {
    static final long mod = 1000000007L;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int n = S.length();
        
        if (n == 1) {
            if (S.equals("5") || S.equals("?")) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            return;
        }
        
        long[][] dp = new long[n][13];
        
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (S.charAt(i) != '?') {
                    int digit = Character.getNumericValue(S.charAt(i));
                    dp[i][digit] = 1;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[i][j] = 1;
                    }
                }
            } else {
                if (S.charAt(i) != '?') {
                    int digit = Character.getNumericValue(S.charAt(i));
                    for (int k = 0; k < 13; k++) {
                        int newIndex = (k * 10 + digit) % 13;
                        dp[i][newIndex] = (dp[i][newIndex] + dp[i-1][k]) % mod;
                    }
                } else {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 13; k++) {
                            int newIndex = (k * 10 + j) % 13;
                            dp[i][newIndex] = (dp[i][newIndex] + dp[i-1][k]) % mod;
                        }
                    }
                }
            }
        }
        
        System.out.println(dp[n-1][5]);
    }
}

