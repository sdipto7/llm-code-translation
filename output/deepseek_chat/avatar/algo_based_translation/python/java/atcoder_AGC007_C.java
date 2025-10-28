import java.util.Scanner;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class atcoder_AGC007_C {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double d = scanner.nextDouble();
        double x = scanner.nextDouble();
        double result = main(N, d, x);
        System.out.println(result);
        scanner.close();
    }
    
    public static double main(int N, double d, double x) {
        double ret = 0.0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d = d + (d / N) + (5 * x) / (2 * N);
            x += 2 * x / N;
            N -= 1;
        }
        return ret;
    }
}
