
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class s663509070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        ArrayList<int[]> mat = new ArrayList<>();
        for (int d = 0; d < N; d++) {
            int[] row = new int[D];
            for (int k = 0; k < D; k++) {
                row[k] = sc.nextInt();
            }
            mat.add(row);
        }
        int c = 0;
        for (int i = 0; i < mat.size() - 1; i++) {
            for (int j = i + 1; j < mat.size(); j++) {
                int sumSquares = 0;
                for (int k = 0; k < D; k++) {
                    int diff = mat.get(i)[k] - mat.get(j)[k];
                    sumSquares += diff * diff;
                }
                double dist = sqrt(sumSquares);
                if (dist == (int) dist) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}

