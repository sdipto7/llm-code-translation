
import java.util.*;
import java.util.stream.*;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Double> arr = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Double::parseDouble)
                                .collect(Collectors.toList());
        
        List<Double> fractionalParts = arr.stream()
                                         .map(x -> x - Math.floor(x))
                                         .filter(frac -> frac != 0.0)
                                         .sorted()
                                         .collect(Collectors.toList());
        
        int o = 2 * n - fractionalParts.size();
        double arrSum = fractionalParts.stream().mapToDouble(Double::doubleValue).sum();
        double res = 2e9;
        
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arrSum));
            }
        }
        
        System.out.printf("%.3f%n", res);
    }
}

