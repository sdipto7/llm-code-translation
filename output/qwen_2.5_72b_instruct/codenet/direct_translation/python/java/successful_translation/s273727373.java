import java.util.Scanner;
import java.util.Arrays;

public class s273727373 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int[] B = Arrays.copyOf(A, N);
        int count = 1;
        for (int i = 0; i < N; i++) {
            B[A[i] - 1] = count;
            count++;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(B[i] + (i < N - 1 ? " " : ""));
        }
    }
}
