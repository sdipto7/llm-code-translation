
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_AGC021_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        double[][] XY = new double[N][2];
        for (int i = 0; i < N; i++) {
            XY[i][0] = Double.parseDouble(input[i * 2 + 1]);
            XY[i][1] = Double.parseDouble(input[i * 2 + 2]);
        }

        for (int i = 0; i < N; i++) {
            double[] D = new double[N - 1];
            int index = 0;
            for (int j = 0; j < N; j++) {
                if (j != i) {
                    D[index++] = Math.atan2(XY[j][0] - XY[i][0], XY[j][1] - XY[i][1]);
                }
            }
            Arrays.sort(D);
            double[] newD = new double[N];
            System.arraycopy(D, 0, newD, 0, N - 1);
            newD[N - 1] = D[0] + 2 * Math.PI;
            double ans = 0;
            for (int j = 0; j < N; j++) {
                double a = newD[j];
                double b = newD[j + 1];
                if (b - a >= Math.PI) {
                    ans = b - a - Math.PI;
                }
            }
            System.out.println(ans / (2 * Math.PI));
        }
    }
}

