
import java.util.Scanner;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tcs = 1;
        int tc = 1;
        while (tc <= tcs) {
            solve(tc, scanner);
            tc++;
        }
        scanner.close();
    }

    private static void solve(int tc, Scanner scanner) {
        int a = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(a == 0 ? 1 : 0);
    }
}

