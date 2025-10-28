
import java.util.Scanner;

public class atcoder_AGC004_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        sc.nextLine();
        String[] aParts = sc.nextLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(aParts[i]);
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
        int minTotal = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += b[j][i];
            }
            int current = sum + x * j;
            if (current < minTotal) {
                minTotal = current;
            }
        }
        System.out.println(minTotal);
    }
}

