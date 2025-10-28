
import java.util.*;

public class s846046431 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        for (int i = N - 1; i >= N - M; i--) {
            if ((double) A[i] / sum - 1.0 / (4 * M) < 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

