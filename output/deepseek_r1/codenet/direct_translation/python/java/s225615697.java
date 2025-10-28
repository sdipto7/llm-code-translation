
import java.util.Scanner;

public class s225615697 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] aParts = scanner.nextLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(aParts[i]);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (i % 2 == 0) ? a[i] : -a[i];
        }
        int m1 = sum / 2;
        int[] m = new int[n];
        m[0] = m1;
        for (int i = 1; i < n; i++) {
            m[i] = a[i - 1] - m[i - 1];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(m[i] * 2);
            if (i < n - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}

