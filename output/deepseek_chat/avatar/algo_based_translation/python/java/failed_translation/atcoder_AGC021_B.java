
import java.util.*;
import java.lang.Math;

public class atcoder_AGC021_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> XYList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            XYList.add(scanner.nextInt());
        }
        
        List<int[]> XY = new ArrayList<>();
        for (int i = 0; i < XYList.size(); i += 2) {
            int[] point = {XYList.get(i), XYList.get(i + 1)};
            XY.add(point);
        }
        
        for (int i = 0; i < XY.size(); i++) {
            int x = XY.get(i)[0];
            int y = XY.get(i)[1];
            List<Double> D = new ArrayList<>();
            
            for (int j = 0; j < XY.size(); j++) {
                if (j != i) {
                    int X = XY.get(j)[0];
                    int Y = XY.get(j)[1];
                    double angle = Math.atan2(Y - y, X - x);
                    D.add(angle);
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

