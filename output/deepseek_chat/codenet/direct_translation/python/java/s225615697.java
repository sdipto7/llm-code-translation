import java.util.Scanner;

public class s225615697 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m1 = (int) (sumAlternating(a) / 2);
        int[] m = new int[n];
        m[0] = m1;
        for (int i = 1; i < n; i++) {
            m[i] = a[i - 1] - m[i - 1];
        }
        for (int x : m) {
            System.out.print((x * 2) + " ");
        }
    }

    private static double sumAlternating(int[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * Math.pow(-1, i);
        }
        return sum;
    }
}
