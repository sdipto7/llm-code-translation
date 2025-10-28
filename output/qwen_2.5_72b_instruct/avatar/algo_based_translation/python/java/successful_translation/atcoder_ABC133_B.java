import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC133_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        List<List<Integer>> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> point = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                point.add(scanner.nextInt());
            }
            points.add(point);
        }

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dist(points.get(i), points.get(j)) % 1 == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static double dist(List<Integer> x, List<Integer> y) {
        double tmp = 0.0;
        for (int i = 0; i < x.size(); i++) {
            tmp += Math.pow(x.get(i) - y.get(i), 2);
        }
        return Math.sqrt(tmp);
    }
}
