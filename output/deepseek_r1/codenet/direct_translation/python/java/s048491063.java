
import java.util.Scanner;

public class s048491063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[][] train = new int[N][N];
        for (int i = 0; i < M; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            train[l - 1][r - 1]++;
        }
        int[][] accum = new int[N + 1][N + 1];
        for (int i = 0; i < N; i++) {
            int v = 0;
            int[] temp = new int[N + 1];
            for (int j = 0; j < N; j++) {
                v += train[i][j];
                temp[j + 1] = accum[i][j + 1] + v;
            }
            accum[i + 1] = temp;
        }
        for (int i = 0; i < Q; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            System.out.println(accum[q][q] - accum[p - 1][q] - accum[q][p - 1] + accum[p - 1][p - 1]);
        }
    }
}

