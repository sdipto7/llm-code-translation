
import java.util.Scanner;

public class s087080706 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int low = 0, high = n;
        while (low < high) {
            int mid = (low + high) / 2;
            if (a[mid] > x) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(Math.min(low, n - low));
    }
}

