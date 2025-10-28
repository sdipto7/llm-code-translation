
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] parts = scanner.nextLine().trim().split("\\s+");
        List<Double> arr = new ArrayList<>();
        
        for (String part : parts) {
            double x = Double.parseDouble(part);
            double fractional = x - (int)x;
            if (fractional != 0.0) {
                arr.add(fractional);
            }
        }
        
        Collections.sort(arr);
        int o = 2 * n - arr.size();
        double arrSum = 0.0;
        for (double num : arr) {
            arrSum += num;
        }
        double res = 2e9;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                double currentDiff = Math.abs(i - arrSum);
                if (currentDiff < res) {
                    res = currentDiff;
                }
            }
        }
        System.out.printf("%.3f%n", res);
    }
}

