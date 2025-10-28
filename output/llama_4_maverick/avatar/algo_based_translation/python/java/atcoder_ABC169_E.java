
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] low = new int[n];
        int[] high = new int[n];
        for (int i = 0; i < n; i++) {
            low[i] = scanner.nextInt();
            high[i] = scanner.nextInt();
        }
        Arrays.sort(low);
        Arrays.sort(high);
        double result;
        if (n % 2 == 1) {
            double median_high = high[(n + 1) / 2 - 1];
            double median_low = low[(n + 1) / 2 - 1];
            result = median_high - median_low + 1;
        } else {
            double median_high = (high[n / 2 - 1] + high[n / 2]) / 2.0;
            double median_low = (low[n / 2 - 1] + low[n / 2]) / 2.0;
            result = (median_high - median_low) * 2 + 1;
        }
        System.out.println((int) result);
    }
}

