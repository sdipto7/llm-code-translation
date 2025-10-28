
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class s663509070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        ArrayList<int[]> mat = new ArrayList<>();
        
        for (int d = 0; d < N; d++) {
            int[] row = new int[D];
            for (int k = 0; k < D; k++) {
                row[k] = scanner.nextInt();
            }
            mat.add(row);
        }
        
        int c = 0;
        for (int i = 0; i < mat.size() - 1; i++) {
            for (int j = i + 1; j < mat.size(); j++) {
                double sum = 0.0;
                for (int k = 0; k < D; k++) {
                    double diff = mat.get(i)[k] - mat.get(j)[k];
                    sum += diff * diff;
                }
                double dist = Math.sqrt(sum);
                if (dist == (int)dist) {
                    c++;
                }
            }
        }
        
        System.out.println(c);
        scanner.close();
    }
}

