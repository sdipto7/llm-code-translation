
import java.util.Scanner;

public class codeforces_598_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int _ = 0; _ < t; _++) {
            int n = scanner.nextInt();
            System.out.println(solve(n));
        }
        scanner.close();
    }

    public static long solve(int n) {
        long s = (long) (1 + n) * n / 2;
        long t = 1;
        while (t <= n) {
            s -= 2 * t;
            t *= 2;
        }
        return s;
    }
}

