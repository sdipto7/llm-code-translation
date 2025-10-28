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
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        double s = Arrays.stream(a).sum() / (4.0 * m);
        if (a[m - 1] >= s) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
