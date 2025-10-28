
import java.util.Scanner;

public class codeforces_387_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] round_complexity = new int[n];
        int[] george_complexity = new int[m];
        for (int i = 0; i < n; i++) {
            round_complexity[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            george_complexity[i] = scanner.nextInt();
        }
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (round_complexity[i] <= george_complexity[j]) {
                i++;
            }
            j++;
        }
        System.out.println(n - i);
    }
}

