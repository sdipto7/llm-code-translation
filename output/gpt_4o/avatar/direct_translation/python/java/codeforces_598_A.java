
import java.util.Scanner;

public class codeforces_598_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            System.out.println(solve(n));
        }
        scanner.close();
    }

    public static long solve(int n) {
        long s = (1L + n) * n / 2;
        long t = 1;
        while (t <= n) {
            s -= 2 * t;
            t *= 2;
        }
        return s;
    }
}

