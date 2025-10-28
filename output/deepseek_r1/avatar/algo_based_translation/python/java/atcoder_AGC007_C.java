
import java.util.Scanner;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();
        System.out.println(computeResult(N, d, x));
    }

    private static double computeResult(int N, int dVal, int xVal) {
        double ret = 0.0;
        double currentD = dVal;
        double currentX = xVal;
        int currentN = N;

        while (currentN > 0) {
            ret += currentD + (currentN - 0.5) * currentX;
            double denominator = currentN;
            currentD += (currentD / denominator) + (5 * currentX) / (2 * denominator);
            currentX += (2 * currentX) / denominator;
            currentN--;
        }

        return ret;
    }
}

