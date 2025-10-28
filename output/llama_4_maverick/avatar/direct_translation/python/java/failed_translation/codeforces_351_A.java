
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }
        double[] fractionalParts = new double[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            double fractionalPart = arr[i] - (int) arr[i];
            if (fractionalPart != 0) {
                fractionalParts[count++] = fractionalPart;
            }
        }
        double[] trimmedFractionalParts = Arrays.copyOfRange(fractionalParts, 0, count);
        Arrays.sort(trimmedFractionalParts);
        int o = 2 * n - count;
        double arrSum = 0;
        for (int i = 0; i < count; i++) {
            arrSum += trimmedFractionalParts[i];
        }
        double res = 2e9;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arrSum));
            }
        }
        System.out.printf("%.3f", res);
    }
}

