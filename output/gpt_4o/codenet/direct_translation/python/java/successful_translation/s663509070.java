
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
            for (int x = 0; x < D; x++) {
                row[x] = scanner.nextInt();
            }
            mat.add(row);
        }
        
        int c = 0;
        for (int i = 0; i < mat.size() - 1; i++) {
            for (int j = i + 1; j < mat.size(); j++) {
                double dist = 0;
                for (int k = 0; k < D; k++) {
                    dist += Math.pow(mat.get(i)[k] - mat.get(j)[k], 2);
                }
                dist = Math.sqrt(dist);
                if (dist == (int) dist) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}

