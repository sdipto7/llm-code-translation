import java.util.Arrays;
import java.util.Scanner;

public class codeforces_351_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] inputArr = scanner.nextLine().trim().split(" ");
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(inputArr[i]);
        }
        arr = Arrays.stream(arr)
                    .map(x -> x - Math.floor(x))
                    .filter(x -> x != 0)
                    .sorted()
                    .toArray();
        int o = 2 * n - arr.length;
        double arrSum = Arrays.stream(arr).sum();
        int res = 2000000000;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - (int)arrSum));
            }
        }
        System.out.printf("%.3f%n", (float)res);
    }
}
