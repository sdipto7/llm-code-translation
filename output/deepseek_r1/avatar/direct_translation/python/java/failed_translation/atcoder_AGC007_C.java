
import java.util.Scanner;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();
        System.out.println(compute(N, d, x));
        scanner.close();
    }

    private static double compute(int N, double d, double x) {
        double ret = 0.0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            double newD = d + d / N + (5 * x) / (2 * N);
            x += (2 * x) / N;
            d = newD;
            N--;
        }
        return ret;
    }
}

