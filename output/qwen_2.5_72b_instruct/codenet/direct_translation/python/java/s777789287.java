import java.util.*;
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
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        double s = 0;
        for (int value : a) {
            s += value;
        }
        s /= 4 * m;
        if (a[m - 1] >= s) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
