
import java.util.Scanner;

public class codeforces_333_B {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        int n = I.nextInt();
        int m = I.nextInt();
        int[] b = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            b[i] = 1;
        }
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;
        for (int i = 0; i < m; i++) {
            int r = I.nextInt();
            int c = I.nextInt();
            b[r - 1] = b[n + c - 1] = 0;
        }
        if (n % 2 != 0 && b[n / 2] != 0 && b[n + n / 2] != 0) {
            b[n / 2] = 0;
        }
        int sum = 0;
        for (int value : b) {
            sum += value;
        }
        System.out.println(sum);
    }
}

