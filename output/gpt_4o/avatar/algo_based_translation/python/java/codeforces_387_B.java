
import java.util.Scanner;

public class codeforces_387_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] roundComplexity = new int[n];
        for (int i = 0; i < n; i++) {
            roundComplexity[i] = scanner.nextInt();
        }
        int[] georgeComplexity = new int[m];
        for (int j = 0; j < m; j++) {
            georgeComplexity[j] = scanner.nextInt();
        }

        // Variable Declarations
        int i = 0;
        int j = 0;

        // Logic Flow
        while (i < n && j < m) {
            if (roundComplexity[i] <= georgeComplexity[j]) {
                i++;
            }
            j++;
        }

        // Output
        System.out.println(n - i);

        scanner.close();
    }
}

