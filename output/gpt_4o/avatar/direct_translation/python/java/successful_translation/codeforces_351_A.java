
import java.util.*;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = scanner.nextDouble();
        }
        List<Double> fractionalParts = new ArrayList<>();
        for (double x : arr) {
            double fractionalPart = x - Math.floor(x);
            if (fractionalPart != 0) {
                fractionalParts.add(fractionalPart);
            }
        }
        Collections.sort(fractionalParts);
        int o = 2 * n - fractionalParts.size();
        double arrSum = 0;
        for (double val : fractionalParts) {
            arrSum += val;
        }
        int res = (int) 2e9;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = (int) Math.min(res, Math.abs(i - arrSum));
            }
        }
        System.out.printf("%.3f%n", (double) res);
    }
}

