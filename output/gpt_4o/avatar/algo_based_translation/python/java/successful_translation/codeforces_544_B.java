
import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read integers n and k from input
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Step 2: Initialize variable x to 0
        int x = 0;

        // Step 3: Calculate maximum number of 'L' that can be placed
        if (k <= Math.max(n * n / 2, n * n - (n * n / 2))) {
            System.out.println("YES");

            // Loop i from 0 to n - 1
            for (int i = 0; i < n; i++) {
                // Loop j from 0 to n - 1
                for (int j = 0; j < n; j++) {
                    // Condition
                    if (i % 2 == j % 2 && x < k) {
                        System.out.print("L");
                        x++;
                    } else {
                        System.out.print("S");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}

