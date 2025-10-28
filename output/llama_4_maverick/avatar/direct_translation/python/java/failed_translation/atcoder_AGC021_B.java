
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_AGC021_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] XY = new double[2 * N];
        for (int i = 0; i < 2 * N; i++) {
            XY[i] = sc.nextDouble();
        }
        double[][] points = new double[N][2];
        for (int i = 0; i < N; i++) {
            points[i][0] = XY[2 * i];
            points[i][1] = XY[2 * i + 1];
        }
        for (int i = 0; i < N; i++) {
            double x = points[i][0];
            double y = points[i][1];
            double[] angles = new double[N - 1];
            int k = 0;
            for (int j = 0; j < N; j++) {
                if (j != i) {
                    double X = points[j][0];
                    double Y = points[j][1];
                    angles[k++] = Math.atan2(Y - y, X - x);
                }
            }
            Arrays.sort(angles);
            double[] extendedAngles = new double[N];
            System.arraycopy(angles, 0, extendedAngles, 0, N - 1);
            extendedAngles[N - 1] = angles[0] + 2 * Math.PI;
            double ans = 0;
            for (int j = 0; j < N; j++) {
                double a = extendedAngles[j];
                double b = extendedAngles[j + 1];
                if (b - a >= Math.PI) {
                    ans = Math.max(ans, (b - a) - Math.PI);
                }
            }
            System.out.println(ans / (2 * Math.PI));
        }
    }
}

