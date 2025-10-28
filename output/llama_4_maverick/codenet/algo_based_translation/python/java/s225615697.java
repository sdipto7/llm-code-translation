
import java.util.Scanner;
import java.util.Arrays;

public class s225615697 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        int m1 = (int) Math.round(calculateM1(a, n) * 2) / 2;

        int[] m = new int[n];
        m[0] = m1;
        for (int i = 1; i < n; i++) {
            m[i] = a[i - 1] - m[i - 1];
        }

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = String.valueOf(m[i] * 2);
        }

        System.out.println(String.join(" ", result));
    }

    private static double calculateM1(int[] a, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] * Math.pow(-1, i);
        }
        return sum / 2;
    }
}

