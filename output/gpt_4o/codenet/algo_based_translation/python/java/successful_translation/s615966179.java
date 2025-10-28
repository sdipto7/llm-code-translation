
import java.util.Scanner;

public class s615966179 {

    public static int calculateMaximumDays(int n, int a, int b) {
        int ans = (n / (a + b)) * a;
        int r = Math.min(n % (a + b), a);
        ans += r;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int result = calculateMaximumDays(n, a, b);
        System.out.println(result);
    }
}

