
import java.util.Scanner;

public class codeforces_598_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(solve(n));
        }
        scanner.close();
    }

    private static int solve(int n) {
        int s = (1 + n) * n / 2;
        int currentPower = 1;
        while (currentPower <= n) {
            s -= 2 * currentPower;
            currentPower *= 2;
        }
        return s;
    }
}

