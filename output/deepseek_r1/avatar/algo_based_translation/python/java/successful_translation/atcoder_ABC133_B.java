
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC133_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        List<int[]> points = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int[] point = new int[d];
            for (int j = 0; j < d; j++) {
                point[j] = scanner.nextInt();
            }
            points.add(point);
        }
        
        int count = 0;
        for (int i = 0; i < points.size(); i++) {
            int[] x = points.get(i);
            for (int j = i + 1; j < points.size(); j++) {
                int[] y = points.get(j);
                double distance = calculateDistance(x, y);
                if (distance == Math.floor(distance)) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
        scanner.close();
    }

    private static double calculateDistance(int[] x, int[] y) {
        long sum = 0;
        for (int i = 0; i < x.length; i++) {
            int diff = x[i] - y[i];
            sum += (long) diff * diff;
        }
        return Math.sqrt(sum);
    }
}

