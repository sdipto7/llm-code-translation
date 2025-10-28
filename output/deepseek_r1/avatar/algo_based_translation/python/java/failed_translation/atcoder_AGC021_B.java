
import java.util.*;
import static java.lang.Math.*;

public class atcoder_AGC021_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> xCoords = new ArrayList<>();
        List<Integer> yCoords = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            xCoords.add(scanner.nextInt());
            yCoords.add(scanner.nextInt());
        }
        
        for (int i = 0; i < n; i++) {
            int x = xCoords.get(i);
            int y = yCoords.get(i);
            List<Double> angles = new ArrayList<>();
            
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    int x2 = xCoords.get(j);
                    int y2 = yCoords.get(j);
                    double dx = x2 - x;
                    double dy = y2 - y;
                    angles.add(atan2(dx, dy));
                }
            }
            
            Collections.sort(angles);
            angles.add(angles.get(0) + 2 * PI);
            double maxGap = 0.0;
            
            for (int k = 0; k < angles.size() - 1; k++) {
                double diff = angles.get(k + 1) - angles.get(k);
                if (diff >= PI) {
                    maxGap = diff - PI;
                }
            }
            
            System.out.println(maxGap / (2 * PI));
        }
    }
}

