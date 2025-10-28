import java.util.Scanner;
import java.util.Arrays;

public class atcoder_AGC004_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.nextLine();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            int m = a[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (k < 0) {
                    k += n;
                }
                m = Math.min(m, a[k]);
                b[j][i] = m;
            }
        }
        
        long minTotal = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long currentSum = 0;
            for (int j = 0; j < n; j++) {
                currentSum += b[i][j];
            }
            long totalCost = currentSum + (long) x * i;
            if (totalCost < minTotal) {
                minTotal = totalCost;
            }
        }
        
        System.out.println(minTotal);
    }
}
