
import java.util.Scanner;

public class s287369394 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int d = Math.min(A[i], B[i]);
            ans += d;
            A[i] -= d;
            B[i] -= d;
            int d2 = Math.min(A[i + 1], B[i]);
            ans += d2;
            A[i + 1] -= d2;
            B[i] -= d2;
        }
        System.out.println(ans);
    }
}

