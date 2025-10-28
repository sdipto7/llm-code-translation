
import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class atcoder_AGC021_B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = reader.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int[] XY = Arrays.stream(inputs, 1, inputs.length).mapToInt(Integer::parseInt).toArray();

        List<int[]> points = new ArrayList<>();
        for (int i = 0; i < XY.length; i += 2) {
            points.add(new int[]{XY[i], XY[i + 1]});
        }

        for (int i = 0; i < points.size(); i++) {
            int x = points.get(i)[0];
            int y = points.get(i)[1];
            List<Double> D = new ArrayList<>();

            for (int j = 0; j < points.size(); j++) {
                if (j != i) {
                    int X = points.get(j)[0];
                    int Y = points.get(j)[1];
                    double angle = atan2(Y - y, X - x);
                    D.add(angle);
                }
            }

            Collections.sort(D);
            D.add(D.get(0) + 2 * PI);

            double ans = 0.0;
            for (int j = 0; j < D.size() - 1; j++) {
                double a = D.get(j);
                double b = D.get(j + 1);
                if (b - a >= PI) {
                    ans = (b - a) - PI;
                }
            }

            System.out.println(ans / (2 * PI));
        }
    }
}

