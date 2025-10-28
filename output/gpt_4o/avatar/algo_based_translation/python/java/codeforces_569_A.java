
import java.util.Scanner;

public class codeforces_569_A {

    public static int calculateSteps(int t, int s, int q) {
        int ans = 0;
        while (s < t) {
            s *= q;
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.close();

        int result = calculateSteps(t, s, q);
        System.out.println(result);
    }
}

