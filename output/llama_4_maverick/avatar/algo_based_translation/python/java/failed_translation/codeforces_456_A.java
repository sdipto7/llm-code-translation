
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_456_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] m = new int[n][2];
        for (int i = 0; i < n; i++) {
            m[i][0] = scanner.nextInt();
            m[i][1] = scanner.nextInt();
        }
        Arrays.sort(m, (a, b) -> Integer.compare(b[0], a[0]));
        int[] a = m[0];
        boolean found = false;
        for (int i = 1; i < n; i++) {
            if (m[i][1] > a[1]) {
                System.out.println("Happy Alex");
                found = true;
                break;
            }
            a = m[i];
        }
        if (!found) {
            System.out.println("Poor Alex");
        }
    }
}

