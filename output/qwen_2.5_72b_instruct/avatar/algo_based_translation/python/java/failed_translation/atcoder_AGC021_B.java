
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC021_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> XY = new ArrayList<>();
        for (int i = 0; i < 2 * N; i++) {
            XY.add(scanner.nextInt());
        }
        scanner.close();

        List<int[]> coordinates = new ArrayList<>();
        for (int i = 0; i < XY.size(); i += 2) {
            coordinates.add(new int[]{XY.get(i), XY.get(i + 1)});
        }

        for (int i = 0; i < coordinates.size(); i++) {
            int x = coordinates.get(i)[0];
            int y = coordinates.get(i)[1];
            List<Double> D = new ArrayList<>();
            for (int j = 0; j < coordinates.size(); j++) {
                if (j != i) {
                    int X = coordinates.get(j)[0];
                    int Y = coordinates.get(j)[1];
                    D.add(Math.atan2(X - x, Y - y));
                }
            }
            D.add(D.get(0) + 2 * Math.PI);

            double ans = 0;
            for (int k = 0; k < D.size() - 1; k++) {
                double a = D.get(k);
                double b = D.get(k + 1);
                if (b - a >= Math.PI) {
                    ans = (b - a) - Math.PI;
                }
            }
            System.out.println(ans / (2 * Math.PI));
        }
    }
}

