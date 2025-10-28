
import java.util.Scanner;
import java.util.Arrays;

public class s146553386 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n / 2; i++) {
            int temp = a[1][i];
            a[1][i] = a[1][n - 1 - i];
            a[1][n - 1 - i] = temp;
        }
        int[] res0 = new int[n];
        int[] res1 = new int[n];
        res0[0] = a[0][0];
        res1[0] = a[1][0];
        for (int i = 1; i < n; i++) {
            res0[i] = res0[i - 1] + a[0][i];
            res1[i] = res1[i - 1] + a[1][i];
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int check = res0[i] + res1[n - 1 - i];
            ans = Math.max(ans, check);
        }
        System.out.println(ans);
    }
}

