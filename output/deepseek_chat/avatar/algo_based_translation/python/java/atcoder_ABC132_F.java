
import java.util.Scanner;
import java.util.ArrayList;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        final int mod = 1000000007;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        ArrayList<Integer> coefList = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coefList.add((n / i) - (n / (i + 1)));
        }
        
        int sumCoef = 0;
        for (int num : coefList) {
            sumCoef += num;
        }
        int onesCount = n - sumCoef;
        for (int i = 0; i < onesCount; i++) {
            coefList.add(1);
        }
        
        for (int i = 0; i < coefList.size() / 2; i++) {
            int temp = coefList.get(i);
            coefList.set(i, coefList.get(coefList.size() - 1 - i));
            coefList.set(coefList.size() - 1 - i, temp);
        }
        
        int nn = coefList.size();
        int[][] dp = new int[k + 1][nn];
        dp[0][0] = 1;
        
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp = (tmp + dp[i - 1][nn - 1 - j]) % mod;
                dp[i][j] = (int)(((long)coefList.get(j) * tmp) % mod);
            }
        }
        
        long result = 0;
        for (int j = 0; j < nn; j++) {
            result = (result + dp[k][j]) % mod;
        }
        System.out.println(result);
    }
}

