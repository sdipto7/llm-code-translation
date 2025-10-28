
import java.util.Scanner;

public class s287369394 {
    public static int calculateTotal(int N, int[] A, int[] B) {
        int ans = 0;
        for (int i = 0; i < N - 1; i++) {
            int d = Math.min(A[i], B[i]);
            ans += d;
            A[i] -= d;
            B[i] -= d;
            d = Math.min(A[i + 1], B[i]);
            ans += d;
            A[i + 1] -= d;
            B[i] -= d;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N + 1];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }
        System.out.println(calculateTotal(N, A, B));
    }
}

