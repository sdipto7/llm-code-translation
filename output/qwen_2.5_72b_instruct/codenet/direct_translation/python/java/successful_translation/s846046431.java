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
        for (int i = 0; i < N / 2; i++) {
            int temp = A[i];
            A[i] = A[N - 1 - i];
            A[N - 1 - i] = temp;
        }
        int S = 0;
        for (int a : A) {
            S += a;
        }
        for (int i = 0; i < M; i++) {
            if ((double) A[i] / S - 1.0 / (4 * M) < 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
