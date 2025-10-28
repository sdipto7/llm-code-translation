
import java.util.Scanner;

public class codeforces_598_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Read the number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Read the integer n for each test case
            System.out.println(solve(n)); // Call solve and print the result
        }
    }

    public static int solve(int n) {
        int s = (1 + n) * n / 2; // Calculate initial sum s
        int t = 1;
        
        while (t <= n) {
            s -= 2 * t; // Subtract 2 * t from s
            t *= 2; // Double t
        }
        
        return s; // Return the result
    }
}

