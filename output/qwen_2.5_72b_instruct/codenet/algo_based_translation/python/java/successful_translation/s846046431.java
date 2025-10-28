import java.util.Arrays;
import java.util.Scanner;

public class s846046431 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(A);
        int S = 0;
        for (int a : A) {
            S += a;
        }

        for (int i = N - 1; i >= N - M; i--) {
            int a = A[i];
            if ((double) a / S - 1.0 / (4 * M) < 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
