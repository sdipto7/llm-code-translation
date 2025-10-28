
import java.util.Scanner;

public class s048491063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        
        int[][] train = new int[N][N];
        for (int i = 0; i < M; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            train[l-1][r-1]++;
        }
        
        int[][] accum = new int[N+1][N+1];
        accum[0] = new int[N+1];
        for (int i = 1; i <= N; i++) {
            int[] temp = new int[N+1];
            temp[0] = 0;
            int v = 0;
            for (int j = 1; j <= N; j++) {
                v += train[i-1][j-1];
                temp[j] = accum[i-1][j] + v;
            }
            accum[i] = temp;
        }
        
        for (int i = 0; i < Q; i++) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            int result = accum[q][q] - accum[p-1][q] - accum[q][p-1] + accum[p-1][p-1];
            System.out.println(result);
        }
        
        scanner.close();
    }
}

