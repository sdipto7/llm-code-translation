
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
        double[] fractionalParts = Arrays.stream(arr).map(x -> x - (int) x).filter(x -> x != 0).sorted().toArray();
        int o = 2 * n - fractionalParts.length;
        double arrSum = Arrays.stream(fractionalParts).sum();
        double res = 2e9;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arrSum));
            }
        }
        System.out.printf("%.3f", res);
    }
}

