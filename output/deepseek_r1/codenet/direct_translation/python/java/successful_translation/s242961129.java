
import java.util.Scanner;

public class s242961129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int ans = Math.abs(A[N - 1]);
        int[] newA = new int[N + 2];
        newA[0] = 0;
        newA[N + 1] = 0;
        for (int i = 1; i <= N; i++) {
            newA[i] = A[i - 1];
        }
        int[] diff = new int[N];
        for (int i = 1; i <= N; i++) {
            int dif = (Math.abs(newA[i] - newA[i - 1]) + Math.abs(newA[i] - newA[i + 1])) - Math.abs(newA[i - 1] - newA[i + 1]);
            ans += Math.abs(newA[i] - newA[i - 1]);
            diff[i - 1] = dif;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(ans - diff[i]);
        }
    }
}

