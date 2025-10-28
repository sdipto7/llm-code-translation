
import java.util.Scanner;

public class codeforces_500_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        int current_cell = 0;
        while (current_cell <= t) {
            current_cell += s[current_cell - 1];
            if (current_cell == t) {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}

