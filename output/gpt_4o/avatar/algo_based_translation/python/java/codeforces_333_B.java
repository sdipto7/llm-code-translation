
import java.util.Scanner;

public class codeforces_333_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read input for n and m
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Step 2: Create a list `b` with `2*n` elements, all initialized to 1
        int[] b = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            b[i] = 1;
        }

        // Step 3: Set specific elements to 0
        b[0] = 0;
        b[n - 1] = 0;
        b[n] = 0;
        b[2 * n - 1] = 0;

        // Step 4: Loop `m` times
        for (int i = 0; i < m; i++) {
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            b[r - 1] = 0;
            b[n + c - 1] = 0;
        }

        // Step 5: Check condition and set `b[n/2]` if needed
        if (n % 2 != 0 && b[n / 2] == 1 && b[n + n / 2] == 1) {
            b[n / 2] = 0;
        }

        // Step 6: Compute the sum of all elements in `b`
        int sum = 0;
        for (int value : b) {
            sum += value;
        }

        // Step 7: Print the sum
        System.out.println(sum);

        scanner.close();
    }
}

