
import java.util.Scanner;

public class atcoder_AGC004_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] firstLine = scanner.nextLine().trim().split("\\s+");
        int n = Integer.parseInt(firstLine[0]);
        int x = Integer.parseInt(firstLine[1]);
        
        String[] secondLine = scanner.nextLine().trim().split("\\s+");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(secondLine[i]);
        }
        
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            int m = a[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (k < 0) k += n;
                m = Math.min(m, a[k]);
                b[j][i] = m;
            }
        }
        
        long minTotal = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long rowSum = 0;
            for (int num : b[i]) {
                rowSum += num;
            }
            long totalCost = rowSum + (long) x * i;
            if (totalCost < minTotal) {
                minTotal = totalCost;
            }
        }
        
        System.out.println(minTotal);
        scanner.close();
    }
}

