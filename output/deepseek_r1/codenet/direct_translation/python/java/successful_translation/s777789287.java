
import java.util.*;

public class s777789287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
        long sum = 0;
        for (int num : a) {
            sum += num;
        }
        double s = (double) sum / (4 * m);
        System.out.println(a[m - 1] >= s ? "Yes" : "No");
    }
}

