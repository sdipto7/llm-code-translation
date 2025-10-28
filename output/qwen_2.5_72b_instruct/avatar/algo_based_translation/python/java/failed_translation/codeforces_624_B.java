
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(a);
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }

        double pre = Double.POSITIVE_INFINITY;
        int ans = 0;
        for (int j = 0; j < n; j++) {
            ans += Math.max(0, Math.min((int) pre - 1, a[j]));
            pre = Math.max(0, Math.min((int) pre - 1, a[j]));
        }
        System.out.println(ans);
    }
}

