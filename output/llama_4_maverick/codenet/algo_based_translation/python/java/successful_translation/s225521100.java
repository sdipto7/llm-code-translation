
import java.util.Scanner;

public class s225521100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        System.out.println(countUnmarkedElements(N, K, scanner));
        scanner.close();
    }

    public static int countUnmarkedElements(int N, int K, Scanner scanner) {
        int[] A = new int[N];
        for (int i = 0; i < K; i++) {
            int d = scanner.nextInt();
            for (int j = 0; j < d; j++) {
                int index = scanner.nextInt() - 1;
                A[index] = 1;
            }
        }
        int n = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                n++;
            }
        }
        return n;
    }
}

