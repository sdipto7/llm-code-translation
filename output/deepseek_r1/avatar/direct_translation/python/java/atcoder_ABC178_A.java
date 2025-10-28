
import java.util.Scanner;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        int tcs = 1;
        int tc = 1;
        Scanner scanner = new Scanner(System.in);
        while (tc <= tcs) {
            solve(scanner, tc);
            tc++;
        }
        scanner.close();
    }

    private static void solve(Scanner scanner, int tc) {
        int a = scanner.nextInt();
        System.out.println(a == 0 ? 1 : 0);
    }
}

