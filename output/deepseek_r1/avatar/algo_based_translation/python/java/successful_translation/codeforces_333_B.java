
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_333_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] b = new int[2 * n];
        Arrays.fill(b, 1);
        b[0] = 0;
        b[n - 1] = 0;
        b[n] = 0;
        b[2 * n - 1] = 0;

        for (int i = 0; i < m; i++) {
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            b[r - 1] = 0;
            b[n + c - 1] = 0;
        }

        if (n % 2 != 0) {
            int mid = n / 2;
            if (b[mid] == 1 && b[n + mid] == 1) {
                b[mid] = 0;
            }
        }

        int sum = 0;
        for (int num : b) {
            sum += num;
        }

        System.out.println(sum);
        scanner.close();
    }
}

