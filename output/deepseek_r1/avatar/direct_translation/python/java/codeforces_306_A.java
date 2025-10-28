
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_306_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = n / m;
        int r = n % m;
        int[] a = new int[m];
        Arrays.fill(a, q);
        for (int i = 0; i < r; i++) {
            a[i]++;
        }
        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

