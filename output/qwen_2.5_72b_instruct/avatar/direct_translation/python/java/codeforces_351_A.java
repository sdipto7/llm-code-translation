import java.util.*;
import java.util.stream.*;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Double> arr = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Double::parseDouble)
                                .filter(x -> x - Math.floor(x) != 0)
                                .map(x -> x - Math.floor(x))
                                .sorted()
                                .collect(Collectors.toList());
        int o = 2 * n - arr.size();
        double arrSum = arr.stream().mapToDouble(Double::doubleValue).sum();
        int res = (int) 2e9;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = Math.min(res, (int) Math.abs(i - arrSum));
            }
        }
        System.out.printf("%.3f\n", (double) res);
    }
}
