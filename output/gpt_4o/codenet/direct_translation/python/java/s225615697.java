
import java.util.Scanner;

public class s225615697 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m1 = 0;
        for (int i = 0; i < n; i++) {
            m1 += a[i] * (int)Math.pow(-1, i);
        }
        m1 /= 2;

        int[] m = new int[n];
        m[0] = m1;
        for (int i = 1; i < n; i++) {
            m[i] = a[i-1] - m[i-1];
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(m[i] * 2);
            if (i < n - 1) {
                result.append(" ");
            }
        }
        System.out.println(result.toString());
    }
}

