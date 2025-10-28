
import java.util.Scanner;

public class codeforces_500_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int current_cell = 1;
        while (current_cell <= t) {
            current_cell += s[current_cell - 1];
            if (current_cell == t + 1) {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}

