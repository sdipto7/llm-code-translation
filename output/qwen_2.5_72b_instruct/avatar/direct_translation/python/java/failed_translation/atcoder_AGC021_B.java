import java.util.*;
import java.io.*;

public class atcoder_AGC021_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        List<Integer> XY = new ArrayList<>();
        while (st.hasMoreTokens()) {
            XY.add(Integer.parseInt(st.nextToken()));
        }
        List<List<Integer>> points = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            points.add(Arrays.asList(XY.get(2 * i), XY.get(2 * i + 1)));
        }
        for (int i = 0; i < N; i++) {
            List<Double> D = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    int X = points.get(j).get(0);
                    int Y = points.get(j).get(1);
                    int x = points.get(i).get(0);
                    int y = points.get(i).get(1);
                    D.add(Math.atan2(X - x, Y - y));
                }
            }
            Collections.sort(D);
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
