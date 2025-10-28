
import java.util.*;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        List<Double> arr = new ArrayList<>();
        for (String s : input) {
            double x = Double.parseDouble(s);
            if (x - (int) x != 0) {
                arr.add(x - (int) x);
            }
        }
        Collections.sort(arr);
        int o = 2 * n - arr.size();
        double arrSum = arr.stream().mapToDouble(Double::doubleValue).sum();
        double res = 2e9;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arrSum));
            }
        }
        System.out.printf("%.3f%n", res);
    }
}

