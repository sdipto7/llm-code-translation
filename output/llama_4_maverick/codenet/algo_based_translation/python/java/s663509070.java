
import java.util.Scanner;

public class s663509070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int D = Integer.parseInt(inputs[1]);

        int[][] mat = new int[N][D];
        for (int i = 0; i < N; i++) {
            inputs = scanner.nextLine().split(" ");
            for (int j = 0; j < D; j++) {
                mat[i][j] = Integer.parseInt(inputs[j]);
            }
        }

        int c = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                double dist = 0;
                for (int k = 0; k < D; k++) {
                    dist += Math.pow(mat[i][k] - mat[j][k], 2);
                }
                dist = Math.sqrt(dist);
                if (dist == (int) dist) {
                    c++;
                }
            }
        }

        System.out.println(c);
        scanner.close();
    }
}

