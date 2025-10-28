
import java.util.Scanner;

public class s048491063 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read integers N, M, Q from input
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();

        // Step 2: Initialize 2D list `train` with dimensions N x N, filled with 0
        int[][] train = new int[N][N];

        // Step 3: Loop M times to read and process train data
        for (int i = 0; i < M; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            train[l - 1][r - 1] += 1;
        }

        // Step 4: Initialize 2D list `accum` with one row of N+1 zeros
        int[][] accum = new int[N + 1][N + 1];

        // Step 5: Loop through each index i from 0 to N-1
        for (int i = 0; i < N; i++) {
            int[] temp = new int[N + 1];
            int v = 0;
            for (int j = 0; j < N; j++) {
                v += train[i][j];
                temp[j + 1] = accum[i][j + 1] + v;
            }
            accum[i + 1] = temp;
        }

        // Step 6: Loop Q times to process and output query results
        for (int i = 0; i < Q; i++) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            int v = accum[q][q] - accum[p - 1][q] - accum[q][p - 1] + accum[p - 1][p - 1];
            System.out.println(v);
        }

        scanner.close();
    }
}

