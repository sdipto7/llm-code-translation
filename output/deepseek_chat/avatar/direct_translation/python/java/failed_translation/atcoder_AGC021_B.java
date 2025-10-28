import java.util.*;

public class atcoder_AGC021_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] XY = new int[2 * N];
        for (int i = 0; i < 2 * N; i++) {
            XY[i] = sc.nextInt();
        }
        List<int[]> points = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            points.add(new int[]{XY[2 * i], XY[2 * i + 1]});
        }
        for (int i = 0; i < N; i++) {
            int x = points.get(i)[0];
            int y = points.get(i)[1];
            List<Double> D = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                if (j != i) {
                    int X = points.get(j)[0];
                    int Y = points.get(j)[1];
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
