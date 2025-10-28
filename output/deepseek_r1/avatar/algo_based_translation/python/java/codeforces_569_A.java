
import java.util.Scanner;

public class codeforces_569_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();
        int result = calculateIterations(t, s, q);
        System.out.println(result);
    }

    public static int calculateIterations(int t, int s, int q) {
        int ans = 0;
        while (s < t) {
            s *= q;
            ans++;
        }
        return ans;
    }
}

