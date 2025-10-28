
import java.util.Arrays;
import java.util.Scanner;

public class s777789287 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        double s = 0;
        for (int i = n - 1; i >= n - 4 * m; i--) {
            s += a[i];
        }
        s /= 4 * m;
        if (a[n - m] >= s) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

