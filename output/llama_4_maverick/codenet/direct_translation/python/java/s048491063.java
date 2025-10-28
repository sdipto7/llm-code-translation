
import java.util.Scanner;

public class s048491063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        int[][] train = new int[N][N];
        for (int i = 0; i < M; i++) {
            int l = scanner.nextInt() - 1;
            int r = scanner.nextInt() - 1;
            train[l][r]++;
        }

        int[][] accum = new int[N + 1][N + 1];
        for (int i = 0; i < N; i++) {
            int v = 0;
            for (int j = 0; j < N; j++) {
                v += train[i][j];
                accum[i + 1][j + 1] = accum[i][j + 1] + v;
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                accum[i][j] += accum[i - 1][j];
            }
        }

        for (int i = 0; i < Q; i++) {
            int p = scanner.nextInt() - 1;
            int q = scanner.nextInt() - 1;
            int v = accum[q + 1][q + 1] - accum[p][q + 1] - accum[q + 1][p] + accum[p][p];
            System.out.println(v);
        }
    }
}

